package com.automationhub.java.listcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterationExample {

    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // 1. Using for loop
        System.out.println("1. Using for loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // 2. Using Enhanced for loop (Advanced for loop)
        System.out.println("\n2. Using Enhanced for loop:");
        for (String name : names) {
            System.out.println(name);
        }

        // 3. Using while loop
        System.out.println("\n3. Using while loop:");
        int i = 0;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
        }

        // 4. Using Iterator
        System.out.println("\n4. Using Iterator:");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 5. Using ListIterator (forward and backward)
        System.out.println("\n5. Using ListIterator (Forward):");
        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("5. Using ListIterator (Backward):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
