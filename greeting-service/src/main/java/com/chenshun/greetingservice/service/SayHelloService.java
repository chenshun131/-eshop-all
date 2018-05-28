package com.chenshun.greetingservice.service;

import com.chenshun.greetingservice.service.fallback.SayHelloServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User: chenshun131 <p />
 * Time: 18/5/28 12:21  <p />
 * Version: V1.0  <p />
 * Description:  <p />
 */
@FeignClient(value = "say-hello-service", fallback = SayHelloServiceFallback.class)
public interface SayHelloService {

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);

}
