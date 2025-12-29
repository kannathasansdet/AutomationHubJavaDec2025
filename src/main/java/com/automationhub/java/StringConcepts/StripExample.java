package com.automationhub.java.StringConcepts;

public class StripExample {
    public static void main(String[] args) {

        String str = "   Java Programming   ";

        System.out.println("Original: '" + str + "'");
        System.out.println("Strip: '" + str.strip() + "'"); // Removes both leading and trailing whitespace
        System.out.println("Strip Leading: '" + str.stripLeading() + "'"); // Removes leading whitespace
        System.out.println("Strip Trailing: '" + str.stripTrailing() + "'"); // Removes trailing whitespace
    }
}


/*
Explanation: These methods remove whitespace from the string.
strip() removes both leading and trailing,
while stripLeading() and stripTrailing() remove only one or the other.*/
