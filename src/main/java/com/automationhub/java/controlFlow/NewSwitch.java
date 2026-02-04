package com.automationhub.java.controlFlow;

public class NewSwitch {


	public static void main(String[] args) {

		int day = 7;

		String dayName = switch (day) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		default -> "Invalid";
		};
		
		System.out.println(dayName);
	}

}


/*
 * int day = 7;
 * 
 * String dayName;
 * 
 * switch (day) { 
 * case 1 -> dayName = "Monday"; 
 * case 2 -> dayName = "Tuesday";
 * default -> dayName = "Invalid";
 */


/*
 * int day = 7;
 * 
 * String dayName = switch (day) { case 1 : yield dayName = "Monday"; case 2 :
 * yield dayName = "Tuesday"; default : yield dayName = "Invalid"; };
 * 
 * System.out.println(dayName);
 */


/*
 * String dayName = switch (day) { case 1 -> "Monday"; case 2 -> "Tuesday";
 * default -> "Invalid"; };
 * 
 * System.out.println(dayName);
 */