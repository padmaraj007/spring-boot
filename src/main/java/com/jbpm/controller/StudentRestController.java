package com.jbpm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbpm.entity.Student;
import com.jbpm.services.StudentService;

@RestController
public class StudentRestController {

	@Autowired
	StudentService studentService;

	@GetMapping("/getStudent")
	public List<Student> getStudent() {

		List<Student> student = studentService.getStudent();

		return student;

	}

	@PostMapping("/saveStudents")
	public Student saveStudent(@RequestBody Student student) {

		return studentService.saveStudent(student);

	}

	@GetMapping("/getStudentByName")
	public Student findByFirstname(@RequestParam String firstname) {
		return studentService.getStudentByName(firstname);

	}
}
