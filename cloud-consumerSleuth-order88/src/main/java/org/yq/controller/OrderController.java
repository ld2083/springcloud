package org.yq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.yq.pojo.CommonResult;
import org.yq.pojo.Payment;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-14  09:24
 * @Description:
 */
@RestController
public class OrderController {

    public static final String PAYMENT_SRV = "http://CLOUD-PAYMENT-SERVICE";
    @Autowired
    private RestTemplate restTemplate;

    // ====================> zipkin+sleuth
    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin()
    {
        return restTemplate.getForObject(PAYMENT_SRV+"/payment/zipkin", String.class);
    }
}