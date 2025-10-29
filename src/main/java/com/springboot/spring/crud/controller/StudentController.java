package com.springboot.spring.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.spring.crud.model.Student;
import com.springboot.spring.crud.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;
	@PostMapping
	public String addStudents(@RequestBody Student student) {
		
		return  studentService.addStudents(student);
		/*
		 * System.out.println(student); return student;
		 */

	}

	@DeleteMapping("/id")
	public void removeStudents() {

	}

	@GetMapping("/id")
	public void fetchStudents() {

	}

	@GetMapping
	public void fetchallStudents() {

	}

	@PutMapping
	public void removeAllStudents() {

	}

}
