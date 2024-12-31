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
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private String courseName;
	private int duration;
	private double cost;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "course")
	
	private List<Student> student;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public Course(String courseName, int duration, double cost, List<Student> student) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.cost = cost;
		this.student = student;
	}
	
	
	
	
	
}
