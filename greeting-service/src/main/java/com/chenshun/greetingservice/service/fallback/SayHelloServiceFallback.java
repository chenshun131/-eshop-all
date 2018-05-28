package com.chenshun.greetingservice.service.fallback;

import org.springframework.stereotype.Component;

@Component
public class SayHelloServiceFallback implements SayHelloService {

	public String sayHello(String name) {
		return "error, " + name;
	}

}
