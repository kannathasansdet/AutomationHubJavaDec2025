package com.automationhub.java.constructor;

//Parent class
class Vehicle {
	private String type;
	private int wheels;

	// Parameterized constructor
	public Vehicle(String type, int wheels) {
		this.type = type;
		this.wheels = wheels;
		System.out.println("Vehicle constructor: " + type + " with " + wheels + " wheels");
	}

	// No-arg constructor
	public Vehicle() {
		this("Unknown Vehicle", 0); // Calls parameterized constructor
		System.out.println("Default Vehicle constructor");
	}
}

//Child class
class Car extends Vehicle {
	private String brand;
	private String model;

	// Main constructor
	public Car(String brand, String model, int wheels) {
		super("Car", wheels); // Calls Vehicle's parameterized constructor
		this.brand = brand;
		this.model = model;
		System.out.println("Car constructor: " + brand + " " + model);
	}

	// Partial constructor
	public Car(String brand) {
		this(brand, "Unknown Model", 4); // Calls main constructor
		System.out.println("Partial Car constructor");
	}

	// No-arg constructor
	public Car() {
		this("Unknown Brand"); // Calls partial constructor
		System.out.println("Default Car constructor");
	}
}

public class CarTest {
	public static void main(String[] args) {
		System.out.println("Creating car1:");
		Car car1 = new Car("Toyota", "Camry", 4);

		System.out.println("\nCreating car2:");
		Car car2 = new Car("Honda");

		System.out.println("\nCreating car3:");
		Car car3 = new Car();
	}
}