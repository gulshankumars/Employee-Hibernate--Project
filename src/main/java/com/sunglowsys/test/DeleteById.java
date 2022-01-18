package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeServiceImpl;

public class DeleteById {
    public static void main(String[] args) {
        Employee employee = new Employee();
        new  EmployeeServiceImpl().delete(4L);
        System.out.println(employee);
    }
}
