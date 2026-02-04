package com.automationhub.java.mapcollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterationDemo {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "JavaScript");

        System.out.println("HashMap Data: " + map);
        System.out.println("--------------------------------------------------");

        // 1️⃣ Iteration using entrySet() - BEST WAY
        System.out.println("1. Using entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("--------------------------------------------------");

        // 2️⃣ Iteration using keySet()
        System.out.println("2. Using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        System.out.println("--------------------------------------------------");

        // 3️⃣ Iteration using values()
        System.out.println("3. Using values():");
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("--------------------------------------------------");

        // 4️⃣ Iteration using Iterator with entrySet()
        System.out.println("4. Using Iterator with entrySet():");
        Iterator<Map.Entry<Integer, String>> entryIterator =
                map.entrySet().iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("--------------------------------------------------");

        // 5️⃣ Iteration using Iterator with keySet()
        System.out.println("5. Using Iterator with keySet():");
        Iterator<Integer> keyIterator = map.keySet().iterator();

        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            System.out.println(key + " = " + map.get(key));
        }

        System.out.println("--------------------------------------------------");

        // 6️⃣ Iteration using Java 8 forEach() method
        System.out.println("6. Using forEach() with Lambda:");
        map.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });

        System.out.println("--------------------------------------------------");

        // 7️⃣ Iteration using Java 8 Streams
        System.out.println("7. Using Streams:");
        map.entrySet()
                .stream()
                .forEach(entry ->
                        System.out.println(entry.getKey() + " = " + entry.getValue())
                );

        System.out.println("--------------------------------------------------");

        // 8️⃣ Stream with filter example
        System.out.println("8. Streams with filter (key > 2):");
        map.entrySet()
                .stream()
                .filter(entry -> entry.getKey() > 2)
                .forEach(entry ->
                        System.out.println(entry.getKey() + " = " + entry.getValue())
                );
    }
}
