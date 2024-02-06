package com.shahin.helloworld.service;

import com.shahin.helloworld.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}
