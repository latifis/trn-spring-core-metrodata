package com.acc.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateConfig {

    @Bean
    public Employee employee1(){
        return new Employee();
    }

    @Bean
    public Employee employee2(){
        return new Employee();
    }

}
