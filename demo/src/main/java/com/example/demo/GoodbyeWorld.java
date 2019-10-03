package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
@Slf4j
public class GoodbyeWorld {

    @PreDestroy
    public void onDestroy() {
        log.info("Goodbye");
    }

}
