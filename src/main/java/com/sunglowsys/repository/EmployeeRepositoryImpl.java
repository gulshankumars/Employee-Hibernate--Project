package com.sunglowsys.repository;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Employee save(Employee employee) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long id = (Long) session.save(employee);
        session.getTransaction().commit();
        Employee result = session.get(Employee.class,id);
        return result;
    }

    @Override
    public Employee update(Employee employee, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee1 = session.get(Employee.class,id);
        employee1.setFirstName(employee.getFirstName());
        session.update(employee1);
        session.getTransaction().commit();
        session.close();
        System.out.println("updated successfully");
        return null;
    }

    @Override
    public List<Employee> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Employee");
        List<Employee>  employeeList = query.list();
        session.getTransaction().commit();
        session.close();
        return employeeList;
    }

    @Override
    public Employee findById(Long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Employee employee= session.get(Employee.class,id);
        session.getTransaction().commit();
        session.close();
        return employee;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class,id);
        session.delete(employee);
        session.getTransaction().commit();
        session.close();
        System.out.println("Deieted successfully");

    }
}
