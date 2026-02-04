package com.automationhub.java.exceptionHandling;


// Step 1: Create Custom Exception (Checked Exception)
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingSystem {

    // Step 2: Method that throws Custom Exception
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is not eligible for voting. Minimum age is 18.");
        } else {
            System.out.println("Eligible for voting.");
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(16);  // This will throw exception
            System.out.println("Voting process started.");
        } catch (InvalidAgeException e) {
            // Step 3: Handle exception
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}
