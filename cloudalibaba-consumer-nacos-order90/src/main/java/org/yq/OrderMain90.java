package org.yq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-18  15:12
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain90 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain90.class,args);
    }
}
