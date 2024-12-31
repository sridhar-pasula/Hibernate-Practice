package demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private int carId;
	private String carName;
	private String color;
	private double cost, mileage;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", color=" + color + ", cost=" + cost + ", mileage="
				+ mileage + "]";
	}
	public Car(int carId, String carName, String color, double cost, double mileage) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.color = color;
		this.cost = cost;
		this.mileage = mileage;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
