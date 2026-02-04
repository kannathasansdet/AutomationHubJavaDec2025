package com.automationhub.java.mapcollection;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding elements
        linkedHashMap.put("Apple", 50);
        linkedHashMap.put("Banana", 30);
        linkedHashMap.put("Mango", 70);
        linkedHashMap.put("Grapes", 40);

        // Replacing value
        linkedHashMap.put("Mango", 75);

        // Access
        System.out.println("Price of Mango: " + linkedHashMap.get("Mango"));

        // Checking
        System.out.println("Contains 'Banana'? " + linkedHashMap.containsKey("Banana"));

        // Removing
        linkedHashMap.remove("Apple");

        // Iterating
        System.out.println("\nIterating over LinkedHashMap:");
        linkedHashMap.forEach((fruit, price) ->
                System.out.println(fruit + " => " + price)
        );

        // Keys and Values
        System.out.println("Keys: " + linkedHashMap.keySet());
        System.out.println("Values: " + linkedHashMap.values());
    }
}
