package org.jsp.onetoone_uni_assignment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import org.jsp.onetoone_uni_assignment.dto.Student;
import org.jsp.onetoone_uni_assignment.dto.Student_Jsp_Details;

public class Student_JspDetails_Dao {
	public void saveStudent(Student student) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onetoone");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		
		transaction.begin();
		manager.persist(student);
		transaction.commit();
	}
	public void saveJsp(Student_Jsp_Details jsp) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onetoone");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		
		transaction.begin();
		manager.persist(jsp);
		transaction.commit();
	}
	public void UpdateJsp(Student_Jsp_Details jsp) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onetoone");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		
		transaction.begin();
		manager.merge(jsp);
		transaction.commit();
	}
	public void UpdateStudent(Student student) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onetoone");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		
		transaction.begin();
		manager.merge(student);
		transaction.commit();
	}
	
	public void findStudent(Student student, int studentId) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onetoone");
		EntityManager manager = factory.createEntityManager();
		Student studentDetails= manager.find(Student.class,studentId);
		if(studentDetails!=null) {
			System.out.println(studentDetails);
		}else {
			System.out.println("student not found");
		}
		
	}
	
	public void findJsp(Student_Jsp_Details car, int jspId) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onetoone");
		EntityManager manager = factory.createEntityManager();
		Student_Jsp_Details jspDetails= manager.find(Student_Jsp_Details.class, jspId);
		if(jspDetails!=null) {
			System.out.println(jspDetails);
		}else {
			System.out.println("Jsp student not found");
		}
		
	}
	
	public void DeleteStudent(Student student,int studentId) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onetoone");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		Student studentDetails= manager.find(Student.class, studentId);
		transaction.begin();
		manager.remove(studentDetails);
		transaction.commit();
	}
	public void DeleteJsp(Student_Jsp_Details car,int jspId) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onetoone");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		Student_Jsp_Details jspDetails= manager.find(Student_Jsp_Details.class,jspId);
		if(jspDetails!=null) {
		transaction.begin();
		manager.remove(jspDetails);
		transaction.commit();
		}else {
			System.out.println("Jsp student does not exist");
		}
	}

}
