package com.acc.springcore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjectionConfig {

    @Bean
    public Employee employee(){
        return new Employee();
    }

    @Bean(value = "userOne")
    public User user(){
        return new User();
    }

    @Bean
    public EmployeeUser employeeUser(@Qualifier("employeeOne") Employee employee, @Qualifier("userOne") User user){
        return new EmployeeUser(employee, user);
    }

}
