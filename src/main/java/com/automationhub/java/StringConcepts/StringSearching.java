package com.automationhub.java.StringConcepts;

public class StringSearching {
    public static void main(String[] args) {
        String str = "Java Programming";

        int index = str.indexOf("Java");
        System.out.println("Index of 'Program': " + index);

        boolean containsJava = str.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);

        boolean containsPython = str.contains("Python");
        System.out.println("Contains 'Python': " + containsPython);
    }
}