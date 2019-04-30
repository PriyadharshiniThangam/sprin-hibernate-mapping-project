package com.springboot.hibernate.service;

import java.util.List;

import com.springboot.hibernate.model.Employee;

public interface EmployeeService {

    public void addEmployee(Employee employee);
    public List<Employee> getAllEmployees();


    public void deleteEmployee(Integer id);


}
