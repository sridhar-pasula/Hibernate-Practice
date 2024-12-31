package org.jsp.manytomany_bi.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.manytomany_bi.dao.Student_Course_Dao;
import org.jsp.manytomany_bi.dto.Course;
import org.jsp.manytomany_bi.dto.Student;

public class Student_Course_Controller {

	public static void main(String[] args) {
		 
		Student student1= new Student("Sridhar", "male", 22, "Sridhar@gmail.com", null);
		Student student2= new Student("navya", "female", 21, "navya@gmail.com", null);
		Student student3= new Student("Sai", "male", 22, "Sai@gmail.com", null);
		
		Course course1= new Course("java",6 , 25000, null);
		Course course2= new Course("python",8 , 30000, null);
		Course course3= new Course("java",6 , 25000, null);
		
		
		List<Student> studentList= new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		List<Course> courseList= new ArrayList<Course>();
		
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		
		student1.setCourse(courseList);
		student2.setCourse(courseList);
		student3.setCourse(courseList);
		
		course1.setStudent(studentList);
		course2.setStudent(studentList);
		course3.setStudent(studentList);
		
		
		Student_Course_Dao dao= new Student_Course_Dao();
		dao.saveStudent(student3);
		
		
		
		// student have course but course does not have student
		
				
//		Course course1= new Course("ml",6 , 25000, null);
//		Course course2= new Course("ai",8 , 30000, null);
//		List<Course> courseList= new ArrayList<Course>();
//		courseList.add(course1);
//		courseList.add(course2);
//		Student student1= new Student("Sravan", "male", 22, "Sravan@gmail.com", courseList);
////		Student student2= new Student("sowmya", "female", 21, "sowmya@gmail.com", courseList);
////		Student student3= new Student("manisha", "female", 20, "manisha@gmail.com", courseList);
//		studentList.add(student1);
////		studentList.add(student2);
////		studentList.add(student3);
//		
//		dao.saveStudent(student1);
		
		
		

	}

}
