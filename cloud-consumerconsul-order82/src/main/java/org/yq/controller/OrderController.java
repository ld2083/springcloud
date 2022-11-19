package org.yq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-14  18:15
 * @Description:
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    public static final String INVOKE_URL = "http://consul-provider-payment";


    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo() {
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        System.out.println("消费者调用支付服务(consul)--->result:" + result);
        return result;
    }
}
