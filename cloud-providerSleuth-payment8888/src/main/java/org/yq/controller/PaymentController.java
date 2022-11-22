package org.yq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.yq.pojo.CommonResult;
import org.yq.pojo.Payment;
import org.yq.service.PaymentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-14  08:30
 * @Description:
 */
@RestController
public class PaymentController {

    @GetMapping("/payment/zipkin")
    public String paymentZipkin() {
        return "hi ,i'am paymentzipkin server fall back，welcome to atguigu，O(∩_∩)O哈哈~";
    }
}