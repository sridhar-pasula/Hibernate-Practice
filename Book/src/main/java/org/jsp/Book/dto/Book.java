package org.jsp.Book.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Book {

	private double cost;
	private String author;
	
	@EmbeddedId
	private Book_Id id;

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book_Id getId() {
		return id;
	}

	public void setId(Book_Id id) {
		this.id = id;
	}

	public Book(double cost, String author, Book_Id id) {
		super();
		this.cost = cost;
		this.author = author;
		this.id = id;
	}
	
	
}
