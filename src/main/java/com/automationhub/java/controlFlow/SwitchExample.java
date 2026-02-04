package com.automationhub.java.controlFlow;

public class SwitchExample {

	public static void main(String[] args) {

/*
		switch (expression) {
			case value1:
				// Code block for value1
				break; // Exits the switch
			case value2:
			case value3:
				// Code block for value2 and value3 (fall-through for value2 is intentional here)
				break;
			default:
				// Code block if no case matches (optional)
				break; // Not strictly necessary if default is last
		}
*/

		/*int day = 1;

		switch (day) {
		    case 1:
		        System.out.println("Monday");
				break;
		    case 2:
		        System.out.println("Tuesday");
				break;
			default:
		        System.out.println("Another day");
		}*/

		/*String result = "TakeCare";

		switch (result) {

			case "PASS":
				System.out.println("Congrats");
				break;
			case "FAIL":
				System.out.println("better Luck next time");
				break;
			default:
				System.out.println("Study Well");


		}
*/

		/*String browser = "Chrome";

		switch (browser) {

			case "Chrome":
				System.out.println("launch Chrome Browser");
				break;
			case "FF":
				System.out.println("launch FF Browser");
				break;
			default:
				System.out.println("Launch In Safari browser");

		}*/

		int value = 1;
		switch (value) {
			case 1:
				System.out.println("Check balance");
				System.out.println("withdraW");
				break;
			case 3:
				System.out.println("Deposit");
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid");
		}

	}
}

