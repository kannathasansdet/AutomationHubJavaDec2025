package com.automationhub.java.StringConcepts;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "jaVa";
        String str3 = "Java";

        System.out.println("str1.equals(str2): " + str1.equals(str2)); // false (case-sensitive)
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2)); // true (case-insensitive)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // true (string literal pool)
    }
}

/*
Explanation:
equals() compares strings for equality based on content (case-sensitive).
equalsIgnoreCase() does the same, but ignores case.
== compares object references (not content). Use equals() for content comparison.*/
