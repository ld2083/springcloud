package org.yq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yq.pojo.Payment;

import java.util.List;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-14  08:31
 * @Description:
 */
@Mapper
public interface PaymentMapper {
    /**
     * 查询所有
     * @return
     */
    List<Payment> findAll();

    /**
     * 添加
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据id查找
     * @param id
     * @return
     */
    Payment selectPaymentById(@Param("id") Long id);
}
