package com.automationhub.java.constructor;

public class ParameterizedConstructor {
	String brand;
	String model;
	double price;

	// Parameterized constructor
	public ParameterizedConstructor(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public static void main(String[] args) {
		ParameterizedConstructor parameterizedConstructor1 = new ParameterizedConstructor("Samsung", "Galaxy S23", 999.99);
		ParameterizedConstructor parameterizedConstructor2 = new ParameterizedConstructor("Apple", "iPhone 15", 1099.99);

		System.out.println(parameterizedConstructor1.brand);
		System.out.println(parameterizedConstructor1.model);
		System.out.println(parameterizedConstructor1.price);

	}
}
