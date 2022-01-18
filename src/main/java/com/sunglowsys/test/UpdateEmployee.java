package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeServiceImpl;

public class UpdateEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("Dinky");
        new EmployeeServiceImpl().update(employee,3L);
    }
}
