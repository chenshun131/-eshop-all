package com.chenshun.hystrixterbineserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class HystrixTerbineServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixTerbineServerApplication.class, args);
    }

}
