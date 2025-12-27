package com.automationhub.java.StringConcepts;

public class StringCreation {

    public static void main(String[] args) {

        String str1 = "Hello"; // String literal
        String str2 = new String("Hello"); // Using the constructor
        String str3 = "Hello";


        System.out.println("str1 == str2: " + (str1 == str2)); // false (different objects)
        System.out.println("str1 == str3: " + (str1 == str3)); // true (string literal pool)

        str1 = str1 + " World"; // Concatenation creates a NEW string
        System.out.println("str1 after concatenation: " + str1);
        System.out.println("str1 == str2: " + (str1 == str2)); // false (str1 now points to a new object)

        //Demonstrating immutability
        String original = "Java";
        String modified = original.toUpperCase();
        System.out.println("Original: " + original); // Java (unchanged)
        System.out.println("Modified: " + modified); // JAVA (new string)

        System.out.println("original == modified: " + (original == modified));
    }
}

/*
Explanation:
Demonstrates string literal creation and the constructor.
Shows how string literals are often reused from the string literal pool.
Highlights immutability: concatenation creates a new string object, leaving the original unchanged*/
