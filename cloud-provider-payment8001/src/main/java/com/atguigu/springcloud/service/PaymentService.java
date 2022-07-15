package com.atguigu.springcloud.service;


import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: hxx
 * @Date: 2022/7/15
 * @Time: 9:29
 * @Description:
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
