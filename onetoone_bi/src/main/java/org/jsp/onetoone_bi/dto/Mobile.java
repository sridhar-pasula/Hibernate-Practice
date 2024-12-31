package org.jsp.onetoone_bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Mobile {
	@Id
	private int mobileId;
	private String brand;
	private int ram;
	private String color;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private OperatingSystem os;

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public OperatingSystem getOs() {
		return os;
	}

	public void setOs(OperatingSystem os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", brand=" + brand + ", ram=" + ram + ", color=" + color + ", os=" + os
				+ "]";
	}
	
	
}
