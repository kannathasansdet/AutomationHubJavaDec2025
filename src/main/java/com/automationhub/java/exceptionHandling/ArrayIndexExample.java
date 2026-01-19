package com.automationhub.java.exceptionHandling;


public class ArrayIndexExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // index out of range
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index accessed!");
        }
    }
}
