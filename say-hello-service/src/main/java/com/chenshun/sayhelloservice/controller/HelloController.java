package com.chenshun.sayhelloservice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: chenshun131 <p />
 * Time: 18/5/28 20:25  <p />
 * Version: V1.0  <p />
 * Description:  <p />
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/sayHello")
    @HystrixCommand(fallbackMethod = "sayHelloFallback")
    public String sayHello(String name) {
        return "hello, " + name + " from port: " + port;
    }

    public String sayHelloFallback(String name) {
        return "error, " + name;
    }

}
