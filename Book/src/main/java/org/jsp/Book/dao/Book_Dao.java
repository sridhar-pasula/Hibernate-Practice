package org.jsp.Book.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.Book.dto.Book;



public class Book_Dao {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("book");
	private EntityManager entityManager= entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public void saveBook(Book book) {
		
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();
	}


	

}
