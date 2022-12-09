package com.springProject.dao;

import java.util.List;

import com.springProject.model.Student;

public interface StudentDAO
{
	
	List<Student> getAll();
	Student getById(int id);;
	void deleteStudent(int id);
	void save(Student student);

}
