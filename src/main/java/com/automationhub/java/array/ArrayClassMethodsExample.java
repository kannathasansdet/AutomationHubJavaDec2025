package com.automationhub.java.array;


import java.util.Arrays;

public class ArrayClassMethodsExample {
    public static void main(String[] args) {

        // 1. Original array
        int[] numbers = {5, 2, 8, 1, 3};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 2. Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // 3. Copy the array (first 3 elements)
        int[] copy = Arrays.copyOf(numbers, 3);
        System.out.println("Copied Array (first 3): " + Arrays.toString(copy));

        // 4. Fill the array with a single value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled Array with 7: " + Arrays.toString(filledArray));

        // 5. Check equality between arrays
        boolean isEqual = Arrays.equals(numbers, filledArray);
        System.out.println("Is numbers equal to filledArray? " + isEqual);

        // 6. Binary search (array must be sorted)
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3 in sorted array: " + index);

        // 7. Using Arrays.deepToString() for 2D array
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        System.out.println("2D Array: " + Arrays.deepToString(matrix));
    }
}
