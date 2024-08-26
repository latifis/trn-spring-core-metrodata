package com.acc.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigTest {

    @Test
    void testBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println(context.getBean("employee"));
        System.out.println(context.getBean(Employee.class));
//        Employee emp2 = context.getBean("employee2", Employee.class);
        System.out.println(context.getBean("employee", Employee.class));
        Assertions.assertNotNull(context);
    }
}
