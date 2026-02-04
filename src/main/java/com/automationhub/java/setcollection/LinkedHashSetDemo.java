package com.automationhub.java.setcollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        // -------------------------------
        // 1. Creating a LinkedHashSet
        // -------------------------------
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // -------------------------------
        // 2. Adding elements
        // -------------------------------
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Apple");  // duplicate, will be ignored
        System.out.println("LinkedHashSet after add(): " + set);

        // -------------------------------
        // 3. Removing elements
        // -------------------------------
        set.remove("Banana");  // remove specific element
        System.out.println("After remove('Banana'): " + set);

        // -------------------------------
        // 4. Checking element existence
        // -------------------------------
        System.out.println("Contains Mango? " + set.contains("Mango"));
        System.out.println("Contains Banana? " + set.contains("Banana"));

        // -------------------------------
        // 5. Size and emptiness
        // -------------------------------
        System.out.println("Size of set: " + set.size());
        System.out.println("Is set empty? " + set.isEmpty());

        // -------------------------------
        // 6. Iterating LinkedHashSet
        // -------------------------------

        // Using enhanced for loop
        System.out.println("\nIterating using enhanced for loop:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using forEach with lambda (Java 8)
        System.out.println("\nIterating using forEach lambda:");
        set.forEach(fruit -> System.out.println(fruit));

        // -------------------------------
        // 7. Removing all elements
        // -------------------------------
        set.clear();
        System.out.println("\nAfter clear(), is set empty? " + set.isEmpty());
    }
}
