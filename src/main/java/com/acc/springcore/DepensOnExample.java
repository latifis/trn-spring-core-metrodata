package com.acc.springcore;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Slf4j
@Configuration
public class DepensOnExample {

    @Bean
    @DependsOn({
            "user"
    })
    public Employee employee(){
        log.info("Created Employee object");
        return new Employee();
    }

    @Bean
    public User user(){
        log.info("Created User object");
        return new User();
    }

}
