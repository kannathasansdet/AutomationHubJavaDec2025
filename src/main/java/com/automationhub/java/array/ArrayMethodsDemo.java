package com.automationhub.java.array;

import java.util.Arrays;
import java.util.List;

public class ArrayMethodsDemo {

    public static void main(String[] args) {

        // ------------------------------
        // 1. toString()
        // ------------------------------
        int[] numbers = {40, 10, 30, 20};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        // ------------------------------
        // 2. sort()
        // ------------------------------
        Arrays.sort(numbers);
        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(numbers));

        // ------------------------------
        // 3. binarySearch()
        // ------------------------------
        int searchElement = 30;
        int index = Arrays.binarySearch(numbers, searchElement);
        System.out.println("\nBinary Search:");
        System.out.println(searchElement + " found at index: " + index);

        // ------------------------------
        // 4. equals()
        // ------------------------------
        int[] expected = {10, 20, 30, 40};
        System.out.println("\nArray Comparison:");
        System.out.println("Arrays equal? " + Arrays.equals(numbers, expected));

        // ------------------------------
        // 5. copyOf()
        // ------------------------------
        int[] copyArray = Arrays.copyOf(numbers, 6);
        System.out.println("\nCopy Of Array:");
        System.out.println(Arrays.toString(copyArray));

        // ------------------------------
        // 6. copyOfRange()
        // ------------------------------
        int[] rangeArray = Arrays.copyOfRange(numbers, 1, 3);
        System.out.println("\nCopy Of Range (index 1 to 3):");
        System.out.println(Arrays.toString(rangeArray));

        // ------------------------------
        // 7. fill()
        // ------------------------------
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 99);
        System.out.println("\nFilled Array:");
        System.out.println(Arrays.toString(filledArray));

        // ------------------------------
        // 8. asList()
        // ------------------------------
        String[] browsers = {"Chrome", "Firefox", "Edge"};
        List<String> browserList = Arrays.asList(browsers);
        System.out.println("\nArray to List:");
        System.out.println(browserList);

        // ------------------------------
        // 9. 2D Array + deepToString()
        // ------------------------------
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        System.out.println("\n2D Array:");
        System.out.println(Arrays.deepToString(matrix));

        // ------------------------------
        // 10. deepEquals()
        // ------------------------------
        int[][] matrix2 = {
                {1, 2},
                {3, 4}
        };
        System.out.println("\n2D Array Comparison:");
        System.out.println("2D arrays equal? " + Arrays.deepEquals(matrix, matrix2));

        // ------------------------------
        // Real-Time Automation Example
        // ------------------------------
        String[] expectedMenu = {"Login", "Dashboard", "Logout"};
        String[] actualMenu = {"Login", "Dashboard", "Logout"};

        System.out.println("\nAutomation Test Validation:");
        if (Arrays.equals(expectedMenu, actualMenu)) {
            System.out.println("Test Case PASSED");
        } else {
            System.out.println("Test Case FAILED");
        }
    }
}
