package com.automationhub.java.mapcollection;


import java.util.HashMap;
import java.util.Map;

/*
HashMap → Unordered, fastest

LinkedHashMap → Maintains insertion order

TreeMap → Sorted by keys
*/

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put(101, "John");
        hashMap.put(102, "Mary");
        hashMap.put(103, "Steve");
        hashMap.put(null, "NullKeyExample");
        hashMap.put(104, null);
        hashMap.put(105, null);

        // Replacing value for a key
        hashMap.put(103, "David");

        // Accessing elements
        System.out.println("Get roll 102: " + hashMap.get(102));

        // Checking presence
        System.out.println("Contains key 101? " + hashMap.containsKey(101));
        System.out.println("Contains value 'Lucy'? " + hashMap.containsValue("Lucy"));

        // Removing element
        hashMap.remove(104);

        // Iterating using entrySet
        System.out.println("\nIterating over HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Keys and values
        System.out.println("Keys: " + hashMap.keySet());
        System.out.println("Values: " + hashMap.values());
    }
}
