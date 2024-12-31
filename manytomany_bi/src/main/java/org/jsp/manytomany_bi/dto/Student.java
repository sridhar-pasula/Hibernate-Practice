package org.jsp.manytomany_bi.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	private String name;
	private String gender;
	private int age;
	private String email;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(joinColumns = @JoinColumn(name = "studentId"),inverseJoinColumns =@JoinColumn(name="courseId"))
	private List<Course> course;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Student(String name, String gender, int age, String email, List<Course> course) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.course = course;
	}
	
	
	
	
}
