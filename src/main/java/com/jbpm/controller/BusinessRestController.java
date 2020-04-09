package com.jbpm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbpm.entity.Employee;
import com.jbpm.services.BusinessServices;

@RestController
public class BusinessRestController {

	@Autowired
	BusinessServices businessServices;


	@GetMapping("/getEmployees")
	public List<Employee> getEmployee() {
		List<Employee> employeeList = businessServices.getEmployee();
		return employeeList;
	}

    @GetMapping("/getEmployee")	
	public Employee getEmpl(@RequestParam long id) {
    	
    	
		return businessServices.getEmployeeByID(id);
    	
    }
    
    @PostMapping("/saveEmployee")
     public Employee saveEmployee(@RequestBody Employee employee) {
    	
		return businessServices.saveEmployee(employee);
    	
    }
}
