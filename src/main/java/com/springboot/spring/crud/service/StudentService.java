package com.springboot.spring.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.spring.crud.dao.StudentDao;
import com.springboot.spring.crud.model.Student;
import com.springboot.spring.crud.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	@Autowired
	StudentRepository studentRepository;

	public String addStudents(Student student) {
		return studentDao.addStudents(student);
	}

	public Object fetchStudents(int id) {
		Optional<Student> optional = studentDao.fetchStudents(id);
		if (optional.isPresent()) {
			return optional;
		} else {
			return "No data found for " + id;
		}
	}

	public Object fetchallStudents() {
		List<Student> list = studentDao.fetchallStudents();
		if (list.isEmpty()) {
			return "No data found";
		} else
			return list;
	}

	public String removeStudents(int id) {
		Optional<Student> optional = studentDao.fetchStudents(id);
		if (optional.isPresent()) {
			studentRepository.deleteById(id);
			return "Data delete";
		} else
			return "no data found";
	}

	public String removeAllStudents() {
		List<Student> list = studentDao.fetchallStudents();
		if (list.isEmpty()) {
			return "no data found";
		} else {
			studentRepository.deleteAll();
			return "Data deleted";
		}
	}

	public String  editStudents(Student student) {
		Optional<Student> optional=studentDao.fetchStudents(student.getId());
		if(optional.isPresent()) {
			studentRepository.save(student);
			return "data inserted";
		}
		else {
			return "no data found for id "+student.getId();
		}
	}
}