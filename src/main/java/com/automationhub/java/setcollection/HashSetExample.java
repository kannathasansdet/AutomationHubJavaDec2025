package com.automationhub.java.setcollection;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana"); // Duplicate - will be ignored

        // Display set
        System.out.println("Fruits: " + fruits);

        // Check if element exists
        System.out.println("Has Mango? " + fruits.contains("Mango"));

        // Remove element
        fruits.remove("Apple");

        // Iterate
        for (String fruit : fruits) {
            System.out.println("Literation values" + fruit);
        }
    }
}
