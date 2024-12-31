package org.jsp.onetomany_bi.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.onetomany_bi.dao.Customer_Order_Dao;
import org.jsp.onetomany_bi.dto.Customer;
import org.jsp.onetomany_bi.dto.Orders;


public class Customer_Order_Controller {

	public static void main(String[] args) {
		
		Customer_Order_Dao dao= new Customer_Order_Dao();
		
		Customer customer = new Customer();
		customer.setCustomerId(102);
		customer.setCustomerName("shabarman");
		customer.setAddress("hyderabad");
		customer.setMobile(9392983770l);
		
		List<Orders> ordersList= new ArrayList<Orders>();
		
		Orders order1 = new Orders();
		order1.setOrderId(1004);
		order1.setProductName("tws");
		order1.setCost(2000);
		order1.setCustomer(customer);
		
		Orders order2 = new Orders();
		order2.setOrderId(1005);
		order2.setProductName("powerbank");
		order2.setCost(1500);
		order2.setCustomer(customer);
		
		Orders order3 = new Orders();
		order3.setOrderId(1006);
		order3.setProductName("smart Watch");
		order3.setCost(4000);
		order3.setCustomer(customer);
		
		ordersList.add(order1);
		ordersList.add(order2);
		ordersList.add(order3);
		
		
		customer.setOrder(ordersList);
		
		dao.saveCustomer(customer);
		
//		dao.saveOrder(order3);
		

	}

}
