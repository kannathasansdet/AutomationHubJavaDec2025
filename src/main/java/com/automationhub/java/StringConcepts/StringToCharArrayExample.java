package com.automationhub.java.StringConcepts;

import java.util.Arrays;

public class StringToCharArrayExample {

    public static void main(String[] args) {

        String str = "Hello World";

        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Print the character array (using Arrays.toString() for easy printing)
        System.out.println("Original String: " + str);
        System.out.println("Original String: " + charArray); // We can't print array directly
        System.out.println("Character Array: " + Arrays.toString(charArray));

        // You can also iterate through the array to access individual characters
        System.out.println("Individual characters:");

        for (char c : charArray) {
            System.out.println(c);
        }
    }
}
