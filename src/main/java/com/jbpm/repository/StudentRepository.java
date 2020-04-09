package com.jbpm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jbpm.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	
	Student findByFirstname(String firstname);
}
