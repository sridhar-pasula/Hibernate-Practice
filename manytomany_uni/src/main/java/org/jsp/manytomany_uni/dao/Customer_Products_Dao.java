package org.jsp.manytomany_uni.dao;

import java.util.List;
import java.util.ListIterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytomany_uni.dto.Customers;
import org.jsp.manytomany_uni.dto.Products;


public class Customer_Products_Dao {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manytomany");
	private EntityManager entityManager= entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public void saveCustomers(Customers customer) {
		
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
	}
public void saveProducts(Products product) {
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
	}

public void updateProduct(int cusromerId , List<Products> product) {
	
	entityTransaction.begin();
 Customers customer = entityManager.find(Customers.class, product);
	
	if(customer!=null) {
		 List<Products> products= customer.getProducts();
		 products.addAll(product);
		 entityManager.merge(customer);
		 entityTransaction.commit();
	}else {
		System.out.println("No user Found");
	}
}

public void deleteCustomer(int customerId ) {
	
	Customers customer = entityManager.find(Customers.class, customerId);
	customer.setProducts(null);
	entityTransaction.begin();
	entityManager.remove(customer);
	entityTransaction.commit();
}

public void deleteProduct(int productId ) {
	
	Products product = entityManager.find(Products.class, productId);
	Query query = entityManager.createQuery("select customers from Customers customers");
	List<Customers> customers= query.getResultList();
	for(Customers customer : customers) {
		List<Products> prod = customer.getProducts();
		ListIterator<Products> prodList = prod.listIterator();
		while(prodList.hasNext()) {
			Products prod1= prodList.next();
			if(prod1.getProductId()==productId)
				prodList.remove();
		}
	}
	entityTransaction.begin();
	entityManager.remove(product);
	entityTransaction.commit();
}
}
