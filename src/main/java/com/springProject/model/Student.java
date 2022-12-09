package com.springProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	String name;
	
	String Course;
	
	String address;

	public Student()
	{
		super();
	}

	public Student(Integer id, String name, String course, String address) {
		super();
		this.id = id;
		this.name = name;
		Course = course;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Course=" + Course + ", address=" + address + "]";
	}
	
	
	
	
	

}
