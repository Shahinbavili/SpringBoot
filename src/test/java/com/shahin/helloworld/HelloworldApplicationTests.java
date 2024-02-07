package com.shahin.helloworld;

import com.shahin.helloworld.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HelloworldApplicationTests {
    @Autowired
    private BusinessService bs;

    @Test
    void contextLoads() {
    }

    @Test
    void should_say_hello_world() {

        assertThat(bs.getHelloWorld().getValue()).isEqualTo("Hello World!");
    }
}
