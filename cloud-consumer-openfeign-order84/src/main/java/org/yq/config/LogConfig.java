package org.yq.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-16  09:15
 * @Description:
 */
@Configuration
public class LogConfig {

    @Bean
    Logger.Level feignLogger(){
        return Logger.Level.FULL;
    }
}
