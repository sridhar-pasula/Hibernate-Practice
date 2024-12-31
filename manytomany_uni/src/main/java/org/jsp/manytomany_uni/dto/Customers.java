package org.jsp.manytomany_uni.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customerName;
	private String address;
	private long phoneNo;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Products> products;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", phoneNo=" + phoneNo + ", products=" + products + "]";
	}
	
}
