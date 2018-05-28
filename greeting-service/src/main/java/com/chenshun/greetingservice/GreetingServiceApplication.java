package com.chenshun.greetingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringCloudApplication
public class GreetingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingServiceApplication.class, args);
    }

}
