package com.automationhub.java.exceptionHandling;

public class ArithmeticExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b =0;
            int result = a / b; // division by zero
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally{
            System.out.println("No matter I will execute always");
        }
    }
}
