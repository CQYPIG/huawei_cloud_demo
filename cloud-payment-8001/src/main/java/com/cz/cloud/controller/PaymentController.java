package com.cz.cloud.controller;


import com.cz.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import utils.CloudResult;

@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @GetMapping("/getSomething/{id}")
    public CloudResult getSomething(@PathVariable("id")String id){
        return paymentService.getSomething(id);
    }
}
