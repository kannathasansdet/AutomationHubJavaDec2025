package com.automationhub.java.StringConcepts;

public class ContentEqualsExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(str1.contentEquals(sb)); // true
        System.out.println(str1.contentEquals("World")); // false
    }
}

/*
Explanation: contentEquals compares the string to another CharSequence (like a StringBuilder or StringBuffer) for content equality.*/
