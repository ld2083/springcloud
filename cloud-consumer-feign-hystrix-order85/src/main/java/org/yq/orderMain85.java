package org.yq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-16  22:10
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class orderMain85 {
    public static void main(String[] args) {
        SpringApplication.run(orderMain85.class,args);
    }
}
