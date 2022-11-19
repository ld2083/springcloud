package org.yq;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-16  08:16
 * @Description:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.yq.myIrule.MyIRule;

@SpringBootApplication
@EnableFeignClients
@RibbonClient(value = "CLOUD-ORDER-SERVICE",configuration = MyIRule.class)
public class openFeignOrder84 {
    public static void main(String[] args) {
        SpringApplication.run(openFeignOrder84.class,args);
    }
}
