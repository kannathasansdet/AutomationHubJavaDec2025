package com.automationhub.java.array;

public class TwoDimensionalAutomationUseCase {

public static void main(String[] args) {

        String[][] credentials = {
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user3", "pass3"}
        };

        for (int i = 0; i < credentials.length; i++) {
            for (int j = 0; j < credentials[i].length; j++) {
                System.out.print(credentials[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}

