package org.jsp.composite_key.dto;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Amazon {

	private String userId;
	private String password;
	private String address;
	
	@EmbeddedId
	private  Amazon_Id amazonid;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Amazon_Id getAmazonid() {
		return amazonid;
	}

	public void setAmazonid(Amazon_Id amazonid) {
		this.amazonid = amazonid;
	}

	public Amazon(String userId, String password, String address, Amazon_Id amazonid) {
		super();
		this.userId = userId;
		this.password = password;
		this.address = address;
		this.amazonid = amazonid;
	}


	
	
}
