package com.automationhub.java.controlFlow;

public class IfElseConditionExample {

	public static void main(String[] args) {
/*
		if (condition) {
			// Code to execute if the condition is true
		} else {
			// Code to execute if the condition is false
		}
		*/
		int age = 16;

		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are too young to vote.");
		}

		String result = (age>=18) ? "You are eligible to vote" : "You are too young to vote.";

		System.out.println(result);

	}

}
