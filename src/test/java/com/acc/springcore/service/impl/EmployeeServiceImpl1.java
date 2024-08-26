package com.acc.springcore.service.impl;

import com.acc.springcore.service.EmployeeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("emp1")
public class EmployeeServiceImpl1 implements EmployeeService {
}
