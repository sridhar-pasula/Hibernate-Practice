package org.jsp.composite_key.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Amazon_Id implements Serializable {

	private String email;
	private long mobile;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Amazon_Id(String email, long mobile) {
		super();
		this.email = email;
		this.mobile = mobile;
	}
	
	
}
