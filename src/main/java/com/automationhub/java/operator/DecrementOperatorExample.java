package com.automationhub.java.operator;

public class DecrementOperatorExample {
	public static void main(String[] args) {

		int num1 = 9, num2 = 10;

		//post-decrement
		if(num1-- == 9){
			System.out.println("Post-decrement Operator");
			System.out.println("Value of num1: "+num1);
		}

		//pre-decrement
		if(--num2 == 9){
			System.out.println("Pre-decrement Operator");
			System.out.println("Value of num2: "+num2);
		}
	}
}

