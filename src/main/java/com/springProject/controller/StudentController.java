package com.springProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springProject.model.Student;
import com.springProject.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController
{
	@Autowired
	StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> getAll()
	{
		return studentService.getAll();
	}
	
	@GetMapping("/student/{id}")
	public Student getById(@PathVariable int id)
	{
		return studentService.getById(id);	
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteById(@PathVariable int id)
	{
		studentService.deleteStudent(id);
		
		return "deleted sucessfully";
	}
	
	@PutMapping("/student")
	public void update(@RequestBody Student student)
	{
		studentService.save(student);
	}
	
	@PostMapping("/student")
	public void save(@RequestBody Student student)
	{
		studentService.save(student);
	}
	
	

}
