package com.springboot.spring.crud.dao;

import java.util.List;
import java.util.Optional;

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

	public Optional<Student> fetchStudents(int id) {
		Optional<Student> optional=studentRepository.findById(id);
		return optional;

	}
	public List<Student> fetchallStudents() {
		List<Student>list=studentRepository.findAll();
		return list;
	}

	

}
