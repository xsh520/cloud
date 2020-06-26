package com.xsh.cloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentHystrixFallBackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "paymentInfo_OK累了睡了："+id;
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "paymentInfo_TimeOut哈哈哈滚蛋："+id;
    }
}
