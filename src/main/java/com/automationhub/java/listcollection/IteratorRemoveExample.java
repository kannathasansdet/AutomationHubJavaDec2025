package com.automationhub.java.listcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemoveExample {

    public static void main(String[] args) {


        // Creating ArrayList
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("David");
        names.add("Charlie");
        names.add("Daniel");

        System.out.println("Before removal: " + names);

        // Using Iterator to remove elements safely
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {

            String name = iterator.next();

            // Condition to remove element
            if (name.startsWith("D")) {
                iterator.remove(); // ✅ Safe removal
            }
        }

        System.out.println("After removal: " + names);
    }
}
