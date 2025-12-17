package com.automationhub.java.controlFlow;

public class IfElseifConditionExample {

	public static void main(String[] args) {

/*
		if (condition1) {
			// code to execute if condition1 is true
		} else if (condition2) {
			// code to execute if condition2 is true
		} else if (condition3) {
			// code to execute if condition3 is true
		}
// ... you can have many else if blocks ...
		else {
			// code to execute if none of the conditions are true
		}
*/

		int marks = 77;

		if (marks >= 90) {
			System.out.println("Grade A");
		} else if (marks >= 75) {
			System.out.println("Grade B");
		} else if (marks >= 50) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail");
		}

	}

}
