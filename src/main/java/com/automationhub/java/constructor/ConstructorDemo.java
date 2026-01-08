package com.automationhub.java.constructor;

public class ConstructorDemo {

	// Fields (properties)

	private String make;
	private String model;
	private int year;

	// Constructor

	public ConstructorDemo(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	// Another constructor (overloaded)
	public ConstructorDemo() {
		this.make = "Unknown";
		this.model = "Unknown";
		this.year = 0;
	}

	// Method to display car information
	public void displayInfo() {
		System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
	}

	public static void main(String[] args) {
		// Using the parameterized constructor
		ConstructorDemo constructorDemo1 = new ConstructorDemo("Toyota", "Camry", 2022);
		constructorDemo1.displayInfo();

		// Using the no-argument constructor
		ConstructorDemo constructorDemo2 = new ConstructorDemo();
		constructorDemo2.displayInfo();
	}
}
