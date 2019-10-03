package com.example.toolbox;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Comparator;
import java.util.List;

@Component
@Slf4j
public class Toolbox {

    @Bean
    public Tool toolz() {
        return new Tool() {};
    }

    @Autowired
    private List<Tool> tools;

    @PostConstruct
    public void init() {


        tools.sort(Comparator.comparing(tool -> tool.getClass().getSimpleName())
                .reversed());
        log.info("Toolbox created");
    }
}
