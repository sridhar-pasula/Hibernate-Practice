package org.jsp.onetoone_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetoone_bi.dto.Mobile;
import org.jsp.onetoone_bi.dto.OperatingSystem;

public class Mobile_Os_Dao {

	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("onetoone");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public void saveMobile(Mobile mobile) {
		EntityManager entityManager= getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityTransaction.commit();
	}
	
	public void saveOS(OperatingSystem os) {
		EntityManager entityManager= getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(os);
		entityTransaction.commit();
	}
	public void findMobile(Mobile mobile, int mobileId) {
		EntityManager entityManager= getEntityManager();
		Mobile details=entityManager.find(Mobile.class, mobileId);
		System.out.println(details);
		
	}
	public void findOS(OperatingSystem os,int osId) {
		EntityManager entityManager= getEntityManager();
		OperatingSystem osDetails =entityManager.find(OperatingSystem.class,osId);
		System.out.println(osDetails);
		
	}
}
