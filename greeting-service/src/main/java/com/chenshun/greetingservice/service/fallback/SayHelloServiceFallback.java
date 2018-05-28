package com.chenshun.greetingservice.service.fallback;

import com.chenshun.greetingservice.service.SayHelloService;
import org.springframework.stereotype.Component;

@Component
public class SayHelloServiceFallback implements SayHelloService {

    @Override
    public String sayHello(String name) {
        return "error, " + name;
    }

}
