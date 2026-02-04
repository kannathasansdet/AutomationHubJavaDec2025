package com.automationhub.java.StringConcepts;

public class StartsWithOffsetExample {
    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println(str.startsWith("Java", 0)); // true
        System.out.println(str.startsWith("Program", 5)); // true
        System.out.println(str.startsWith("Java", 1)); // false
    }
}

/*Explanation: Checks if the string starts with the specified prefix, starting the check at the given offset.*/
