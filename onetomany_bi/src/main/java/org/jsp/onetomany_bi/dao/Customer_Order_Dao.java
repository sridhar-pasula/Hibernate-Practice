package org.jsp.onetomany_bi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetomany_bi.dto.Customer;
import org.jsp.onetomany_bi.dto.Orders;

public class Customer_Order_Dao {

	EntityManager manager= Persistence.createEntityManagerFactory("onetomany").createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	public void saveCustomer( Customer customer) {
		List<Orders> orders = customer.getOrder();
		for (Orders orders2 :orders) {
			orders2.setCustomer(customer);
		}
		transaction.begin();
		manager.persist(customer);
		transaction.commit();
	}
	public void saveOrder(Orders order) {
		transaction.begin();
		manager.persist(order);
		transaction.commit();
	}
}
