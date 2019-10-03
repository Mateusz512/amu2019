package com.example.toolbox;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Profile("murarz")
@Order(2)
@Slf4j
public class MyTool implements Tool {

}
