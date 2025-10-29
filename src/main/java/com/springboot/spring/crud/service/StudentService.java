package com.springboot.spring.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.spring.crud.dao.StudentDao;
import com.springboot.spring.crud.model.Student;

@Service
public class StudentService {

	
	@Autowired
	StudentDao studentDao;
	public String addStudents(Student student) {
		return studentDao.addStudents(student);
	}
}
