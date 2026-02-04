package com.automationhub.java.StringConcepts;

public class StringBuilderExamples {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // 1. Append
        sb.append(" World");
        System.out.println("After append: " + sb);// Hello World

        // 2. Insert
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb); // Hello Java World

        // 3. Replace
        sb.replace(6, 10, "Beautiful");
        System.out.println("After replace: " + sb); // Hello Beautiful World

        // 4. Delete
        sb.delete(6, 16);
        System.out.println("After delete: " + sb); // Hello World

        // 5. Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb); // dlroW olleH

        // 6. Capacity & Length
        System.out.println("Length: " + sb.length());      // length of string
        System.out.println("Capacity: " + sb.capacity());  // allocated memory
    }
}
