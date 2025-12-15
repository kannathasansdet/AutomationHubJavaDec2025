package com.automationhub.java.casting;

public class NarrowingExample {

	public static void main(String[] args) {
		
		double price = 10.0;
		
		byte roundedPrice = (byte) price; // double to byte
		
		System.out.println("Rounded price: " + roundedPrice);

	}

}
