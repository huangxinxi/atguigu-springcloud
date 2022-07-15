package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;

import com.atguigu.springcloud.service.PaymentService;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: hxx
 * @Date: 2022/7/15
 * @Time: 9:30
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    //@Resource是java自带的,@Autowired是spring的
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
