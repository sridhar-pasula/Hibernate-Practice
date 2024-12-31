package org.jsp.onetomany_uni.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class NetflixUser {
	@Id
	private int accountId;
	private String accountPassword;
	private String plan;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Movies> movies;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public List<Movies> getMovies() {
		return movies;
	}

	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}

	public NetflixUser(int accountId, String accountPassword, String plan, List<Movies> movies) {
		super();
		this.accountId = accountId;
		this.accountPassword = accountPassword;
		this.plan = plan;
		this.movies = movies;
	}

	public NetflixUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
