package com.jbpm.services;

import java.util.List;

import com.jbpm.entity.Employee;

public interface BusinessServices {

	List<Employee> getEmployee();
	
	Employee getEmployeeByID(long id);
	
	Employee saveEmployee(Employee employee);
}
