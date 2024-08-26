package com.acc.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DuplicateConfig {

    @Primary
//    @Bean
    @Bean(value = "employeeOne") // penamaan/rename
    public Employee employee1(){
        return new Employee();
    }

    @Bean
    public Employee employee2(){
        return new Employee();
    }

}
