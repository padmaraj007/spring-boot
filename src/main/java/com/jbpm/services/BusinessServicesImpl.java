package com.jbpm.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jbpm.entity.Employee;
import com.jbpm.repository.EmployeeRepository;

@Component
public class BusinessServicesImpl implements BusinessServices {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getEmployee() {

		// List<Employee> employeeList = this.generateEmployee();
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList;
	}

	private List<Employee> generateEmployee() {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "abhay", "meshram", "994454154", "pulgaon"));
		list.add(new Employee(2, "padam", "khairkar", "997515333", "wardha"));
		list.add(new Employee(3, "chakuli", "meshram", "213123131", "nagpur"));

		return list;

	}

	@Override
	public Employee getEmployeeByID(long id) {
		Employee employee = employeeRepository.findById(id).get();
				return employee;
			

		

		
	}

	@Override
	public Employee saveEmployee(Employee employee) {

		if (employee.getFirstName().equals("padam")) {
			employee.setId(10);
		}

		if(employee.getFirstName().startsWith("p") && 
				employee.getLastName().startsWith("k")) {
			
			employee.setMobile("999999999");
		}
		
		if(employee.getAddress().contains("india")) {
			employee.setMobile("+91"+employee.getMobile());
		}else if(employee.getAddress().contains("qatar")) {
				employee.setMobile("+99"+employee.getMobile());	
			}
			else {
				employee.setMobile("0");
			}
		
		Employee emp = employeeRepository.save(employee);
		return emp;
	}

	}
