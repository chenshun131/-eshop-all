package com.chenshun.greetingservice.controller;

import com.chenshun.greetingservice.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: chenshun131 <p />
 * Time: 18/5/28 12:22  <p />
 * Version: V1.0  <p />
 * Description:  <p />
 */
@RestController
public class GreetingController {

    @Autowired
    private SayHelloService sayHelloService;

    @Value("${server.port}")
    private String port;

    @Value("${defaultName}")
    private String defaultName;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam String name) {
        String result;
        if (name != null && !"".equals(name)) {
            result = sayHelloService.sayHello(name);
        } else {
            result = "hello, this is default name: " + defaultName;
        }
        result += " , through greeting service from port: " + port;
        return result;
    }

}
