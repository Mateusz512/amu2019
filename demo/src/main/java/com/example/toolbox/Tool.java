package com.example.toolbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public interface Tool {

    Logger log = LoggerFactory.getLogger("Tool");


    @PostConstruct
    default void sayHello() {
        log.info("Hello from {}", this.getClass().getSimpleName());
    }
}
