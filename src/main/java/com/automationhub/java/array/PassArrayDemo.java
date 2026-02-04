package com.automationhub.java.array;

public class PassArrayDemo {

    public static void main(String[] args) {
        int[] marks = {80, 75, 90};
        printArray(marks);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }
}


/*
        int[] numbers = {1, 2, 3};
        updateArray(numbers);
        System.out.println(Arrays.toString(numbers));


    public static void updateArray(int[] arr) {
        arr[0] = 100;
    }
*/

