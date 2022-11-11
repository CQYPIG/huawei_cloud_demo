package com.cz.cloud.service;


import com.cz.cloud.entity.Admin;
import com.cz.cloud.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.CloudResult;

@Service
public class PaymentService {
    @Autowired
    PaymentMapper paymentMapper;
    public CloudResult getSomething(String id){
        Admin something = paymentMapper.getSomething(id);
        CloudResult cloudResult = new CloudResult();
        cloudResult.setResponseCode(200);
        cloudResult.setMessage("请求成功");
        cloudResult.setResult(something);
        return cloudResult;
    }
}
