package com.springProject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springProject.model.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDAOImpl implements StudentDAO 
{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Student> getAll()
	{
		Session currentSession= entityManager.unwrap(Session.class);
		Query< Student> query= currentSession.createQuery("from Student", Student.class);
		List<Student>list= query.getResultList();
		return list;
	}

	@Override
	public Student getById(int id) 
	{
		Session currentSession= entityManager.unwrap(Session.class);
		Student student= currentSession.get(Student.class, id);
		return student;
	}



	@Override
	public void deleteStudent(int id)
	{
		Session currentSession= entityManager.unwrap(Session.class);
		Student student= currentSession.get(Student.class, id);
		currentSession.delete(student);
	}

	@Override
	public void save(Student student)
	{
		Session currentSession= entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(student);
	}

	

}
