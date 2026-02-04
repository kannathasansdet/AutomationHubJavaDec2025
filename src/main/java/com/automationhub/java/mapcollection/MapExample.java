package com.automationhub.java.mapcollection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<Integer, String> students = new HashMap<>();

        // Add elements
        students.put(101, "John");
        students.put(102, "Mary");
        students.put(103, "Steve");
        students.put(104, "Lucy");
        students.put(104, "Kanna");
        students.put(105, "Kanna");
        students.put(null, "Arun");
        students.put(106, null);
        students.put(107, null);

        System.out.println("The list of students " + students);

        // Replace a value for a key
        students.put(103, "David");

        System.out.println("The list of students " + students);
        // Retrieve value
        System.out.println("Student with roll 102: " + students.get(102));

        // Check existence
        System.out.println("Contains roll 101? " + students.containsKey(101));
        System.out.println("Contains name 'Lucy'? " + students.containsValue("Lucy"));

        // Remove by key
        students.remove(104);

        // Loop using entrySet()
        System.out.println("\nAll students:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Display keys and values separately
        System.out.println("\nAll Roll Numbers: " + students.keySet());
        System.out.println("All Names: " + students.values());
    }
}
