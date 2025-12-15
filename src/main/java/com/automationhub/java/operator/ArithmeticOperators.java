package com.automationhub.java.operator;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int a = 15;
        int b = 4;

        // Basic arithmetic operations
        System.out.println("Addition: " + (a + b));          // 19
        System.out.println("Subtraction: " + (a - b));       // 11
        System.out.println("Multiplication: " + (a * b));    // 60
        System.out.println("Division: " + (a / b));          // 3 (integer division)
        System.out.println("Modulus: " + (a % b));           // 3 (remainder)

        // Increment/Decrement
        int count = 5;
        System.out.println("Post-increment: " + count++);    // Prints 5, then becomes 6
        System.out.println("Pre-increment: " + ++count);     // Becomes 7, then prints 7


    }
}