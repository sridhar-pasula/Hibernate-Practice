package org.jsp.manytomany_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytomany_bi.dto.Course;
import org.jsp.manytomany_bi.dto.Student;



public class Student_Course_Dao {
	
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manytomanybi");
	private EntityManager entityManager= entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public void saveStudent(Student student) {
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
public void saveCourse(Course course) {
		
		entityTransaction.begin();
		entityManager.persist(course);
		entityTransaction.commit();
	}

}
