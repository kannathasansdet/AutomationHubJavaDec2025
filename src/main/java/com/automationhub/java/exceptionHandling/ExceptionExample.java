package com.automationhub.java.exceptionHandling;

public class ExceptionExample {

    public static void main(String[] args) {

        try {
            int number = 10 / 2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always execute");
        }

        System.out.println("Program continues after exception handling...");
    }
}
