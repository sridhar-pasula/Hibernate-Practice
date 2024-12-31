package org.jsp.onetoone_uni_assignment.controller;

import org.jsp.onetoone_uni_assignment.dao.Student_JspDetails_Dao;
import org.jsp.onetoone_uni_assignment.dto.Student;
import org.jsp.onetoone_uni_assignment.dto.Student_Jsp_Details;

public class Student_JspDetails_Controller {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(102);
		student.setName("Shabaz");
		student.setEmail("shabaz@gmail.com ");
		student.setAddress("Hyderabad");
		
		Student_Jsp_Details jsp= new Student_Jsp_Details();
		jsp.setStudentJspId(1002);
		jsp.setCourse("python Full Stack");
		jsp.setMockRating("*");
		jsp.setNoOfPlacementsAdded(4);
		
		student.setJsp(jsp);
		
	Student_JspDetails_Dao dao= new Student_JspDetails_Dao();
		dao.saveStudent(student);
		
//		dao.saveJsp(jsp);
		
//		dao.UpdateStudent(student);
//		dao.findStudent(student,student.getStudentId());
//		dao.findJsp(jsp, jsp.getStudentJspId());
//		dao.DeleteStudent(student,student.getStudentId());
//		dao.DeleteJsp(jsp,jsp.getStudentJspId());
		
	}

	}

