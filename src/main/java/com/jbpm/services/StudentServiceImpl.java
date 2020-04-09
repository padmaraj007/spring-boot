package com.jbpm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbpm.entity.Student;
import com.jbpm.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	
	@Override
	public List<Student> getStudent() {

		List<Student> stu = studentRepository.findAll();
		
		return stu;
	}


	@Override
	public Student saveStudent(Student student) {

 Student stud = studentRepository.save(student);
		
		return stud;
	}

	@Override
	public Student getStudentByName(String firstname) {
		return studentRepository.findByFirstname(firstname);
		
	}


	}
	

