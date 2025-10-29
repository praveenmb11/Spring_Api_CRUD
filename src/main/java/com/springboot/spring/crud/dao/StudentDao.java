package com.springboot.spring.crud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.spring.crud.model.Student;
import com.springboot.spring.crud.repository.StudentRepository;

@Repository
public class StudentDao {

	@Autowired
	StudentRepository studentRepository;
	public String addStudents(Student student) {
		studentRepository.save(student);
		return "Data Inserted";
	}
}
