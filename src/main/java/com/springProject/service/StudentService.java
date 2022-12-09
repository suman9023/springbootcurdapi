package com.springProject.service;

import java.util.List;

import com.springProject.model.Student;

public interface StudentService
{
	
	List<Student> getAll();
	Student getById(int id);;
	void deleteStudent(int id);
	void save(Student student);

}
