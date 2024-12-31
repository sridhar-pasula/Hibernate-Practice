package org.jsp.onetomany_bi.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int customerId;
	private String customerName;
	private String address;
	private long mobile;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
	
	private List<Orders> order;

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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public List<Orders> getOrder() {
		return order;
	}

	public void setOrder(List<Orders> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", mobile=" + mobile + ", order=" + order + "]";
	}
	
	

	

//	public Customer(int customerId, String customerName, String address, long mobile, List<Order> order) {
//		super();
//		this.customerId = customerId;
//		this.customerName = customerName;
//		this.address = address;
//		this.mobile = mobile;
//		this.order = order;
//	}

	
	
	
	
	
}
