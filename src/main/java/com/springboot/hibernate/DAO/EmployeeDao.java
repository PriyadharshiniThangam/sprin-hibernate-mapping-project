package com.springboot.hibernate.DAO;

import java.util.List;

import com.springboot.hibernate.model.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public void deleteEmployee(Integer id);

}
