package com.acc.springcore.config;

import com.acc.springcore.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Slf4j
public class ScopeConfig {

    @Bean
    @Scope("prototype")
    public Employee employee() {
        log.info("Creating employee object");
        return new Employee();
    }

}
