package com.springboot.hibernate.service;


	import java.util.List;

	import javax.transaction.Transactional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.springboot.hibernate.DAO.EmployeeDao;
	import com.springboot.hibernate.model.Employee;

	@Service
	public class EmployeeServiceImple implements EmployeeService {
		@Autowired
	    private EmployeeDao employeeDAO;
	    @Override
	    @Transactional
	    public void addEmployee(Employee employee) {
	        employeeDAO.addEmployee(employee);
	    }
	    @Override
	    @Transactional
	    public List<Employee> getAllEmployees() {
	        return employeeDAO.getAllEmployees();
	    }
	    @Override
	    @Transactional

	    public void deleteEmployee(Integer id) {
	        employeeDAO.deleteEmployee(id);
	    }
	    
	}


