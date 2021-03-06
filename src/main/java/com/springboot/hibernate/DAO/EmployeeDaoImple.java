package com.springboot.hibernate.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.springboot.hibernate.model.Employee;

public class EmployeeDaoImple implements EmployeeDao{

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void addEmployee(Employee employee) {
        this.sessionFactory.getCurrentSession().save(employee);
    }
    @SuppressWarnings("unchecked")
    @Override
    public List<Employee> getAllEmployees() {
        return this.sessionFactory.getCurrentSession().createQuery("from Employee").list();
    }
    @Override
    public void deleteEmployee(Integer id) {
        Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
    }
}

