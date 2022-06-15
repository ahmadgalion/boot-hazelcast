package com.javainuse.service;

import java.util.List;

import com.javainuse.model.Employee;
import org.springframework.cache.annotation.Cacheable;

public interface EmployeeService {
	void insertEmployee(Employee emp);
	void insertEmployees(List<Employee> employees);
	List<Employee> getAllEmployees();


	void getEmployeeById(String empid);
}