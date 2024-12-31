package org.jsp.onetoone_uni_assignment.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student_Jsp_Details {
	@Id
	private int StudentJspId;
	private String course;
	private String mockRating;
	private int noOfPlacementsAdded;
	public int getStudentJspId() {
		return StudentJspId;
	}
	public void setStudentJspId(int studentJspId) {
		StudentJspId = studentJspId;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getMockRating() {
		return mockRating;
	}
	public void setMockRating(String mockRating) {
		this.mockRating = mockRating;
	}
	public int getNoOfPlacementsAdded() {
		return noOfPlacementsAdded;
	}
	public void setNoOfPlacementsAdded(int noOfPlacementsAdded) {
		this.noOfPlacementsAdded = noOfPlacementsAdded;
	}
	@Override
	public String toString() {
		return "Student_Jsp_Details [StudentJspId=" + StudentJspId + ", course=" + course + ", mockRating=" + mockRating
				+ ", noOfPlacementsAdded=" + noOfPlacementsAdded + "]";
	}
	
	
}
