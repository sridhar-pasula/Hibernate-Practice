package org.jsp.mobile.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int mobileId;
	private String brandName;
	private int ram;
	private int storage;
	private String processor;
	private double price;
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Mobile(int mobileId, String brandName, int ram, int storage, String processor, double price) {
		super();
		this.mobileId = mobileId;
		this.brandName = brandName;
		this.ram = ram;
		this.storage = storage;
		this.processor = processor;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", brandName=" + brandName + ", ram=" + ram + ", storage=" + storage
				+ ", processor=" + processor + ", price=" + price + "]";
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
}
