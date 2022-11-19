package org.yq.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-15  19:43
 * @Description:
 */
@Configuration
public class MyIRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
