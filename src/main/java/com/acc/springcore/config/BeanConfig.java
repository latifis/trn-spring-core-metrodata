package com.acc.springcore.config;

import com.acc.springcore.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Employee employee() {
        return new Employee();
    }

}
