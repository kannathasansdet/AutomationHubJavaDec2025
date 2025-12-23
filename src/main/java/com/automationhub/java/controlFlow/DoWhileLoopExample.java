package com.automationhub.java.controlFlow;

public class DoWhileLoopExample {

	public static void main(String[] args) {

		/*do {
			// Code to be executed at least once
		} while (condition); // Semicolon is required here
		*/
		int tries = 1;

		boolean wantToPlayAgain = false;

		do {
		    System.out.println("Playing the game. Try #" + tries);
		    tries++;
		} while (wantToPlayAgain);


	}
}

/*

int chocolates = 5;

while (chocolates > 0) {
		System.out.println("Rahul eats a chocolate 🍫");
chocolates--;
		}
*/
