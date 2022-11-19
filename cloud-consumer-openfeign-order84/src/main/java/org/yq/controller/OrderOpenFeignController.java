package org.yq.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.yq.pojo.CommonResult;
import org.yq.pojo.Payment;
import org.yq.service.OrderOpenFeignService;

import javax.annotation.Resource;


/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-16  08:36
 * @Description:
 */
@RestController
public class OrderOpenFeignController {

    @Resource
    private OrderOpenFeignService orderOpenFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return orderOpenFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/create")
    public CommonResult<Payment> creat(Payment payment){
        return orderOpenFeignService.create(payment);
    }
}
