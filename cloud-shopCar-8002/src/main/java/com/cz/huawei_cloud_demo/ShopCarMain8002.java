package com.cz.huawei_cloud_demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShopCarMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(ShopCarMain8002.class,args);
    }
}
