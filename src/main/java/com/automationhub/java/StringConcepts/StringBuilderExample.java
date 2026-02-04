package com.automationhub.java.StringConcepts;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        String result = sb.toString();

        System.out.println("Result: " + result);
    }
}


/*
Explanation:
StringBuilder is mutable, allowing efficient string modifications without creating new objects.
append() adds characters or strings to the end of the StringBuilder.
toString() converts the StringBuilder to a String.*/
