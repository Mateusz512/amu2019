package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class HelloWorld {

    @PostConstruct
    public void init() {
       log.info("Hello World");
    }
}
