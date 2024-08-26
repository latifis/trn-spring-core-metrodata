package com.acc.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeConfigTest {
    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ScopeConfig.class);
    }

    @Test
    void testPrototypeScope(){
        Employee emp1 = context.getBean(Employee.class);
        Employee emp2 = context.getBean(Employee.class);
        Employee emp3 = context.getBean(Employee.class);

        Assertions.assertNotSame(emp1, emp2);
        Assertions.assertNotSame(emp1, emp3);
        Assertions.assertNotSame(emp2, emp3);
    }
}
