package org.yq.service.impl;

import org.springframework.stereotype.Service;
import org.yq.mapper.PaymentMapper;
import org.yq.pojo.Payment;
import org.yq.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-14  08:31
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;


    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment selectPaymentById(Long id) {
        return paymentMapper.selectPaymentById(id);
    }
}
