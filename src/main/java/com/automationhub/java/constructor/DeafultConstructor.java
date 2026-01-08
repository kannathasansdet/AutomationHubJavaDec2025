package com.automationhub.java.constructor;

public class DeafultConstructor {

	String name;
	int age;

	// No constructor defined - Java provides default

	public static void main(String[] args) {

		DeafultConstructor deafultConstructor = new DeafultConstructor(); // Default constructor called

		System.out.println(deafultConstructor.name); // null
		System.out.println(deafultConstructor.age); // 0
	}
}