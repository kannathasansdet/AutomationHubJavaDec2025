package com.automationhub.java.mapcollection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        // Adding elements
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");
        treeMap.put(4, null); // Null values allowed

        // Replacing value
        treeMap.put(3, "ThreeUpdated");

        // Access
        System.out.println("Value for key 2: " + treeMap.get(2));

        // Checking
        System.out.println("Contains key 5? " + treeMap.containsKey(5));

        // Removing
        treeMap.remove(1);

        // Iterating (sorted by key)
        System.out.println("\nIterating over TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Keys and Values
        System.out.println("Keys: " + treeMap.keySet());
        System.out.println("Values: " + treeMap.values());

        Map<String, String> StringtreeMap = new TreeMap<>();

        StringtreeMap.put("Kanna","Anu");
        StringtreeMap.put("Apple","fruit");
        StringtreeMap.put("Mahesh","Student");

        System.out.println(StringtreeMap);

    }
}
