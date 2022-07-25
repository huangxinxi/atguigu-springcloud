package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: hxx
 * @Date: 2022/7/25
 * @Time: 12:44
 * @Description:
 */
@RestController
@Slf4j
public class OrderConsulController {
    public static final String INVOKE_URL = "HTTP://consul-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul/")
    public String paymentInfo(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/consul/",String.class);
    }
}
