package com.acc.springcore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertSame;

public class DependencyInjectionTest {

//    @Test
//    void testWithoutDI(){
//        Employee emp = new Employee();
//        User user = new User(1,"l","c");
//
//        EmployeeUser employeeUser = new EmployeeUser(emp, user);
//
//        assertSame(emp, employeeUser.getEmployee());
//        assertSame(user, employeeUser.getUser());
//    }

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(DependencyInjectionConfig.class);
    }

    @Test
    void testUsingDI(){
        Employee employee = context.getBean(Employee.class);
        User user = context.getBean(User.class);
        EmployeeUser employeeUser = context.getBean(EmployeeUser.class);

        assertSame(employeeUser.getEmployee(), employee);
        assertSame(employeeUser.getUser(), user);
    }
}
