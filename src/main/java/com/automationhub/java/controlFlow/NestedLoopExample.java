package com.automationhub.java.controlFlow;

public class NestedLoopExample {
    public static void main(String[] args) {

        for (int row = 1; row <= 3; row++) {   // Outer Loop
            System.out.println("Row: " + row);

            for (int seat = 1; seat <= 5; seat++) {  // Inner Loop
                System.out.println("   Seat: " + seat);
            }
        }
    }
}










/*
 for (int i = 1; i <= 5; i++) {  // Outer Loop
        for (int j = 1; j <= 5; j++) {  // Inner Loop
        System.out.print(i * j + "\t");
            }
                    System.out.println(); // Move to next line after inner loop ends
        }*/
