package com.automationhub.java.controlFlow;

public class BreakExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				System.out.println("Found the pen at item #" + i);
				break; //Stop searching
			}
			System.out.println("Checking item #" + i);
		}

	}

}
