package org.yq.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.yq.pojo.CommonResult;
import org.yq.pojo.Payment;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-16  08:23
 * @Description:
 */
@Service
@FeignClient(value = "cloud-payment-service")
public interface OrderOpenFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @PostMapping(value = "/payment/create")
    CommonResult<Payment> create(@RequestBody Payment payment);
}
