package com.sunglowsys.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name ="id")
    private Long id ;

    @Column(name = "first_name", nullable = false)
    private String firstName ;

    @Column(name = "last_name")
    private String lastName ;

    @Column(name = "mobile", nullable = false)
    private String mobile ;

    @Column(name = "email", nullable = false, unique = true)
    private String email ;

    @Column(name = "age",nullable = false)
    private String age ;

    public Employee(){}

    public Employee(String firstName, String lastName, String mobile, String email, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(mobile, employee.mobile) && Objects.equals(email, employee.email) && Objects.equals(age, employee.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, mobile, email, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
