package org.jsp.Book.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Book_Id implements Serializable {

	private String name;
	private String publisher;
	private String editor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public Book_Id(String name, String publisher, String editor) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.editor = editor;
	}
	
	
	
}
