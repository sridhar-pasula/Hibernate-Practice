package org.jsp.manytomany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.manytomany_uni.dao.Customer_Products_Dao;
import org.jsp.manytomany_uni.dto.Customers;
import org.jsp.manytomany_uni.dto.Products;

public class Customer_Product_Controller {

	public static void main(String[] args) {
		
		Customers customer1 = new Customers();
		customer1.setCustomerName("sridhar");
		customer1.setAddress("Hyderabad");
		customer1.setPhoneNo(9392983779l);
		
		Customers customer2 = new Customers();
		customer2.setCustomerName("sai");
		customer2.setAddress("medinpur");
		customer2.setPhoneNo(846688829l);
		
		
		Customers customer3 = new Customers();
		customer3.setCustomerName("sravan");
		customer3.setAddress("lbnagar");
		customer3.setPhoneNo(8765789876l);
		
	 List<Products> productList= new ArrayList<Products>();
	  
	 Products product1= new Products();
	 product1.setProductName("Tws");
	 product1.setCost(2000);
	 
	 Products product2= new Products();
	 product2.setProductName("smart watch");
	 product2.setCost(5000);
	 
	 Products product3= new Products();
	 product3.setProductName("power Bank");
	 product3.setCost(2500);
	 
	 Products product4= new Products();
	 product4.setProductName("mobile");
	 product4.setCost(20000);
	 
	 
	 productList.add(product1);
	 productList.add(product2);
	 productList.add(product3);
	 productList.add(product4);
	 
	 customer1.setProducts(productList);
	 customer2.setProducts(productList);
	 customer3.setProducts(productList);
	 
	 
	 Customer_Products_Dao dao= new Customer_Products_Dao();
//	 dao.saveCustomers(customer1);
//	 dao.saveCustomers(customer2);
//	 dao.saveCustomers(customer3);
	 
//	 dao.deleteCustomer(1);
	 dao.deleteProduct(2);
	}
	
}
