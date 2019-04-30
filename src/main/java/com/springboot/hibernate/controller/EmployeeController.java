package com.springboot.hibernate.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hibernate.model.Employee;
import com.springboot.hibernate.service.EmployeeService;


@RestController

public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

   
    

    @RequestMapping(value="/create", method=RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
    }
    @RequestMapping(value="/employee",method=RequestMethod.GET)
    public List<Employee> getAllEmployees()
    {
        List <Employee> employeeList =employeeService.getAllEmployees(); 
        return employeeList;
    }
    @RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
   public void deleteEmployee(@PathVariable("id") Integer id)
   {
       employeeService.deleteEmployee(id);
   }

}