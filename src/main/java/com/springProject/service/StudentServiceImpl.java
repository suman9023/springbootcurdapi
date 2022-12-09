package com.springProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springProject.dao.StudentDAO;
import com.springProject.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Transactional
	@Override
	public List<Student> getAll()
	{
		return studentDAO.getAll();
		
	}

	@Transactional
	@Override
	public Student getById(int id)
	{
		return studentDAO.getById(id);
	}

	@Transactional
	@Override
	public void save(Student student)
	{
		studentDAO.save(student);
	}

	@Transactional
	@Override
	public void deleteStudent(int id)
	{
		studentDAO.deleteStudent(id);
	}

	

}
