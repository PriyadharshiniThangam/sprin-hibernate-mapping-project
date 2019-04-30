package com.springboot.hibernate.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;




@Entity
@Table(name="employee")


public class Employee {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
         private Integer id;
	@Column(name="name")
		 private String name;
	@Column(name="email")
		 private String email;
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="employee_project",joinColumns= {@JoinColumn(name="employee_id")},inverseJoinColumns= {@JoinColumn(name="project_id")})
		 private List<Project> employeeProjectList;
		 public Integer getId() {
		  return id;
		 }
		 public void setId(Integer id) {
		  this.id = id;
		 }
		 public String getName() {
		  return name;
		 }
		 public void setName(String name) {
		  this.name = name;
		 }
		 
		 public String getEmail() {
		  return email;
		 }
		 public void setEmail(String email) {
		  this.email = email;
		 }
		 public List<Project> getEmployeeProjectList(){
			 return employeeProjectList;
			 }
		 public void setEmployeeProjectList(List<Project> employeeProjectList) {
			 this.employeeProjectList=employeeProjectList;
			 }

		 public Employee(Integer id,String name,String email) {
			 super();
			 this.id=id;
			 this.name=name;
			 this.email=email;
		 
		 }
		  public Employee() {
			 
		 }
	}


