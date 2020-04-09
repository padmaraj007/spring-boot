package com.jbpm.services;

import java.util.List;

import com.jbpm.entity.Employee;
import com.jbpm.entity.Student;

public interface StudentService {

	List<Student> getStudent();
	
	Student saveStudent(Student student);
	
	Student getStudentByName(String firstname);
	
}
