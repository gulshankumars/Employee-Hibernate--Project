package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeServiceImpl;

public class FindById {
    public static void main(String[] args) {
        Employee employee = new EmployeeServiceImpl().findById(4L);
        System.out.println(employee);
    }
}
