package org.jsp.onetoone_uni_assignment.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int studentId;
	private String name;
	private String email;
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Student_Jsp_Details jsp;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student_Jsp_Details getJsp() {
		return jsp;
	}

	public void setJsp(Student_Jsp_Details jsp) {
		this.jsp = jsp;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", jsp=" + jsp + "]";
	}
	
	
	
}
