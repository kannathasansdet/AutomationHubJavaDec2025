package com.automationhub.java.mapcollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Add elements
        students.put(101, "Rahul");
        students.put(102, "Anita");
        students.put(103, "Vijay");
        students.put(104, "Priya");

        // Null key & value
        students.put(null, "Unknown");
        students.put(105, null);

        // Display HashMap
        System.out.println("HashMap Data: " + students);

        // Get value by key
        System.out.println("Student 102: " + students.get(102));

        // Check key
        System.out.println("Contains key 103? " + students.containsKey(103));

        // Check value
        System.out.println("Contains value Priya? " + students.containsValue("Priya"));

        // Remove element
        students.remove(101);

        // Iterating using entrySet (BEST way)
        System.out.println("\nIterating HashMap:");
        for (Map.Entry<Integer, String> v : students.entrySet()) {
            System.out.println(v.getKey() + " => " + v.getValue());
        }

        // Get all keys
        System.out.println("\nKeys: " + students.keySet());

        // Get all values
        System.out.println("Values: " + students.values());

        // Size
        System.out.println("Size: " + students.size());
    }
}
