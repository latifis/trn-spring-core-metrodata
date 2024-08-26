package com.acc.springcore.controller;

import com.acc.springcore.service.EmployeeService;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(@Qualifier("emp2") EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
