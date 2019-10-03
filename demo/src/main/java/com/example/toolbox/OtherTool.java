package com.example.toolbox;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Qualifier("other")
@Component
@Order(1)
@Profile("hydraulik")
@Slf4j
public class OtherTool implements Tool {

}
