package com.springboot.spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.spring.crud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
