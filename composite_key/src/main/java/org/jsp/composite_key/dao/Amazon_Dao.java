package org.jsp.composite_key.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.composite_key.dto.Amazon;



public class Amazon_Dao {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("composite");
			private EntityManager entityManager= entityManagerFactory.createEntityManager();
			private EntityTransaction entityTransaction = entityManager.getTransaction();
			
			
			public void saveAmazonUser(Amazon amazon) {
				
				entityTransaction.begin();
				entityManager.persist(amazon);
				entityTransaction.commit();
			}
}
