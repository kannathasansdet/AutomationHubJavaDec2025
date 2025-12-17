package com.automationhub.java.controlFlow;

import java.util.Scanner;

public class NestedIfElseExample {

    public static void main(String[] args) {

        int age = 11;
        String studentStatus = "No";

        // Outer if-else for age check
        if (age >= 18) {
            // First nested if-else for student status
            if (studentStatus.equals("yes")) {
                System.out.println("You're an adult student. You get a 20% discount!");
            } else {
                System.out.println("You're an adult non-student. Regular pricing applies.");
            }
        } else {
            // First nested if-else for minors
            if (age >= 13) {
                // Second nested if-else for teen students
                if (studentStatus.equals("yes")) {
                    System.out.println("You're a teenage student. You get a 30% discount!");
                } else {
                    System.out.println("You're a teenage non-student. You get a 10% discount!");
                }
            } else {
                System.out.println("You're a child. You get free entry!");
            }
        }
    }
}