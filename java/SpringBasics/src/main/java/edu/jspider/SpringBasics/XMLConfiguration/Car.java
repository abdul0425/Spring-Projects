package edu.jspider.SpringBasics.XMLConfiguration;

public class Car {

	private int carId;
	private String carName;
	private String brand;
	private String model;
	public Car(int carId, String carName, String brand, String model) {
		this.carId = carId;
		this.carName = carName;
		this.brand = brand;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", brand=" + brand + ", model=" + model + "]";
	}
	
	
}
