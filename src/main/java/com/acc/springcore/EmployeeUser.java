package com.acc.springcore;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeUser {
    private Employee employee;
    private User user;
}
