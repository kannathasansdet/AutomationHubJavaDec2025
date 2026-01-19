package com.automationhub.java.exceptionHandling;

/*
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);

            int a = 10;
            int b = 0;
            int result = a / b;

            String str = null;
            System.out.println(str.length()); // NullPointerException

        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Exception Error: " + e.getMessage());
        }
        }
    }


*/

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

            String str = null;
            System.out.println(str.length()); // NullPointerException

        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Either array index is invalid or null value encountered!");
            System.out.println("Exception: " + e);
        } finally{
            System.out.println("No matter I will execute always");
        }
    }
}
