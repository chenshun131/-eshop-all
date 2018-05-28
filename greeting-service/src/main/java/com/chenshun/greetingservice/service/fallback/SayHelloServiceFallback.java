package com.chenshun.greetingservice.service.fallback;

import com.chenshun.greetingservice.service.SayHelloService;
import org.springframework.stereotype.Component;

/**
 * User: chenshun131 <p />
 * Time: 18/5/28 12:03  <p />
 * Version: V1.0  <p />
 * Description:  <p />
 */
@Component
public class SayHelloServiceFallback implements SayHelloService {

    @Override
    public String sayHello(String name) {
        return "error, " + name;
    }

}
