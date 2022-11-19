package org.yq.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/consumer/payment/create") //客户端用浏览器是get请求，但是底层实质发送post调用服务端8001
    public CommonResult create(Payment payment) {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Payment> requestEntity = new HttpEntity<Payment>(payment, requestHeaders);
        return restTemplate.postForObject(PAYMENT_SRV + "/payment/create", requestEntity, CommonResult.class);
    }


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id) {
        return restTemplate.getForObject(PAYMENT_SRV + "/payment/get/" + id, CommonResult.class, id);
    }

    @GetMapping("/consumer/PaymentEntity/get/{id}")
    public CommonResult<Payment> getPaymentEntity(@PathVariable Long id) {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_SRV + "/payment/get/" + id, CommonResult.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else {
            return new CommonResult(444,"操作失败");
        }
    }

    @GetMapping("/consumer/PaymentEntity/create") //客户端用浏览器是get请求，但是底层实质发送post调用服务端8001
    public CommonResult createPaymentEntity(Payment payment) {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Payment> requestEntity = new HttpEntity<Payment>(payment, requestHeaders);
        return restTemplate.postForEntity(PAYMENT_SRV+"/payment/create",requestEntity,CommonResult.class).getBody();
        // return restTemplate.postForObject(PAYMENT_SRV + "/payment/create", requestEntity, CommonResult.class);
    }
}