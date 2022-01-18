package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeService;
import com.sunglowsys.service.EmployeeServiceImpl;

public class TestSaveEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Gulshan", "Kumar", "7505059865", "gullumci@gmail.com", "50");
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.save(employee);

    }
}
