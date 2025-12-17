package com.automationhub.java.operator;

public class IncrementOperatorExample {

	public static void main(String[] args) {

		int num1 = 5, num2 = 4;

		//post-increment
		if(num1++ == 5){

			System.out.println("First if block");
			System.out.println("Value of num1: "+num1);
		}
		//pre-increment
		if(++num2 == 5){

			System.out.println("Second if block");
			System.out.println("Value of num2: "+num2);
		}
	}
}
