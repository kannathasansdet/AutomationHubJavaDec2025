package com.automationhub.java.array;
import java.util.Arrays;

public class ArrayJavaMethodsDemo {

    public static void main(String[] args) {

        // 1️⃣ Declare array
        int[] marks = {85, 70, 90, 60};

        System.out.println(marks); // Memory address

        // toString()
        System.out.println("Original Array: " + Arrays.toString(marks));

        // sort()
        Arrays.sort(marks);
        System.out.println("Sorted Array: " + Arrays.toString(marks));

        // binarySearch()
        int index = Arrays.binarySearch(marks, 85);
        System.out.println("Index of 85: " + index);

        // equals()
        int[] marksCopy = {60, 70, 85, 90};
        System.out.println("Arrays equal: " + Arrays.equals(marks, marksCopy));

        // fill()
        int[] seats = new int[5];
        Arrays.fill(seats, 1);
        System.out.println("Filled Array: " + Arrays.toString(seats));

        // copyOf()
        int[] extendedMarks = Arrays.copyOf(marks, 6);
        System.out.println("copyOf(): " + Arrays.toString(extendedMarks));

        // copyOfRange()
        int[] partialMarks = Arrays.copyOfRange(marks, 1, 3);
        System.out.println("copyOfRange(): " + Arrays.toString(partialMarks));

        // 2D Array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // deepToString()
        System.out.println("2D Array: " + Arrays.deepToString(matrix));

        // deepEquals()
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("2D Arrays Equal: " + Arrays.deepEquals(matrix, matrix2));
    }
}
