package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.repository.EmployeeRepositoryImpl;



import java.util.List;

public class FindAll {
    public static void main(String[] args) {
        List<Employee> employeeList = new EmployeeRepositoryImpl().findAll();
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}
