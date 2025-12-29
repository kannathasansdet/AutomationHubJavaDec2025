package com.automationhub.java.StringConcepts;

public class StringFormatting {
    public static void main(String[] args) {

        String name = "Alice";

        int age = 30;

        // Using String.format()
        String formattedString = String.format("My name is %s and I am %d years old.", name, age);

        System.out.println(formattedString);

      //  System.out.println("My name is " + name + "and I am " + age + "years old." );

        // Using f-strings (Java 15+)
        String formattedString2 = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println(formattedString2);

        double price = 123.4567;

        String s = String.format("Product price is %.2f", price);
        System.out.println(s);

        boolean isLoggedIn = true;

        String s1 = String.format("User logged in: %b", isLoggedIn);
        System.out.println(s1);

        char grade = 'A';

        String s2 = String.format("Student grade: %c", grade);
        System.out.println(s2);
    }
}

/*
Explanation:
        String.format() allows you to create formatted strings using placeholders like %s (for strings) and %d (for integers).
Java 15 introduced text blocks and f-strings for more concise formatting.
*/
