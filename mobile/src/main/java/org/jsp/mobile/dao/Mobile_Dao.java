package org.jsp.mobile.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.mobile.dto.Mobile;

public class Mobile_Dao {
	//to save
	public void saveMobile(Mobile mobile) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityTransaction.commit();
		
	}
	
	// to update
	public void updateMobile(Mobile mobile) {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.merge(mobile);
			entityTransaction.commit();
			
		}
	
	public void FindMobile(Mobile mobile,int mobileId) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Mobile mobileDetails =entityManager.find(Mobile.class, mobileId);
		if(mobileDetails!=null) {
		System.out.println(mobileDetails);
		}else {
			System.out.println("mobile does not exist");
		}
		
	}
	public void fetchAllMobiles() {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			Query query= entityManager.createQuery("select mobile from Mobile mobile");
			List list =query.getResultList();
			System.out.println(list);
			
		}
	public void deleteMobiles(Mobile mobile,int mobileId) {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			
			Mobile mobileDetails =entityManager.find(Mobile.class, mobileId);
			entityTransaction.begin();
			entityManager.remove(mobileDetails);
			entityTransaction.commit();
			
		}
}
