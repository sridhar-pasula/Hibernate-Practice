package org.jsp.Book.controller;

import org.jsp.Book.dao.Book_Dao;
import org.jsp.Book.dto.Book;
import org.jsp.Book.dto.Book_Id;

public class Book_Controller {

	public static void main(String[] args) {
		
		Book_Id id= new Book_Id("Ramayan", "JaiSriRam", "Valmiki");
		Book book= new Book(500.0, "maharshi", id);
		
		Book_Dao dao = new Book_Dao();
		dao.saveBook(book);
		

	}
	 

}
