package com.automationhub.java.StringConcepts;

public class StringLengthAndAccess {
    public static void main(String[] args) {
        String str = "Kanna";
        int length = str.length();
        System.out.println("Length of the string: " + length);

        char firstChar = str.charAt(0);
        System.out.println("First character: " + firstChar);

        char lastChar = str.charAt(length - 1);
        System.out.println("Last character: " + lastChar);
    }
}

/*
Explanation:
length() returns the number of characters.
charAt(index) returns the character at the specified index (0-based)*/
