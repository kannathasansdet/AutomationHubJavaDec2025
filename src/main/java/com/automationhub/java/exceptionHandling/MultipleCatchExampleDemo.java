package com.automationhub.java.exceptionHandling;

public class MultipleCatchExampleDemo {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;              // ArithmeticException
            int[] arr = {1, 2};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}

/*
Once an exception occurs, remaining statements inside try are skipped
Only one catch block executes*/

