package com.automationhub.java.controlFlow;

public class ReturnExample {
	
	public static void checkAge(int age) {
		if (age < 18) {
			System.out.println("Not eligible to vote");
			return; // Exit method early
		}
		System.out.println("You can vote!");
	}

	public static void main(String[] args) {
		checkAge(16);
		checkAge(20);

}

}
