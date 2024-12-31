package org.jsp.onetoone_bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OperatingSystem {
	@Id
	private int osId;
	private String osName;
	private int noOfCores;
	private int bit;
	private double speed;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "os")
	private Mobile mobile;

	public int getOsId() {
		return osId;
	}

	public void setOsId(int osId) {
		this.osId = osId;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public int getNoOfCores() {
		return noOfCores;
	}

	public void setNoOfCores(int noOfCores) {
		this.noOfCores = noOfCores;
	}

	public int getBit() {
		return bit;
	}

	public void setBit(int bit) {
		this.bit = bit;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "OperatingSystem [osId=" + osId + ", osName=" + osName + ", noOfCores=" + noOfCores + ", bit=" + bit
				+ ", speed=" + speed + ", mobile=" + mobile + "]";
	}
	
	
}
