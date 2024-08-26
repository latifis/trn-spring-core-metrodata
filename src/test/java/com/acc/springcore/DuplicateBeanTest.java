package com.acc.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateBeanTest {

    @Test
    void testDuplicateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfig.class);
        Employee employee1 = context.getBean("employee1", Employee.class);
        Employee employee2 = context.getBean("employee2", Employee.class);
//        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
//            context.getBean(Employee.class);
//        });
        Assertions.assertSame(employee1, employee2);
    }

}
