package com.automationhub.java.controlFlow;

public class IfConditionExample {

	boolean isRaining = true;

	public static void main(String[] args) {

		IfConditionExample obj = new IfConditionExample();
		/*
Syntax
		if (condition) {
			// Code to be executed if the condition is true
		}
		*/
		if (obj.isRaining) {
			System.out.println("Take an umbrella ☂️");
		}

		// If your mark is 35 or greater than 35 we should print result as PASS

		int mark = 37;
		if (mark>=35){

			System.out.println("PASS");
		}


	}

}
