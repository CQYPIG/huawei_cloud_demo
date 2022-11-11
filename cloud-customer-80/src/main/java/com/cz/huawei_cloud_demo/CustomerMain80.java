package com.cz.huawei_cloud_demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CustomerMain80 {
    public static void main(String[] args) {
        SpringApplication.run(CustomerMain80.class,args);
    }
}
