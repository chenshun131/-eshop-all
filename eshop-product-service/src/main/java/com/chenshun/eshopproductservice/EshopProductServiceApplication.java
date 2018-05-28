package com.chenshun.eshopproductservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan()
@EnableEurekaClient
@SpringBootApplication
public class EshopProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopProductServiceApplication.class, args);
    }

}
