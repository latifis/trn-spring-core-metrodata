package com.acc.springcore;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScanConfigTest {

    @Test
    void scanConfigTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanConfig.class);
        Employee employee = context.getBean("employe", Employee.class);
        System.out.println(employee);
    }
}
