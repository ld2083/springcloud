package org.yq.service;

import org.yq.pojo.Payment;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-14  08:31
 * @Description:
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment selectPaymentById(Long id);
}
