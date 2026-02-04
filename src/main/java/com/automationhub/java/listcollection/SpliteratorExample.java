package com.automationhub.java.listcollection;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        // Getting Spliterator
        Spliterator<String> spliterator = list.spliterator();

        // Traversing elements
        System.out.println("Using spliterator():");
        spliterator.forEachRemaining(System.out::println);


    ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
        numbers.add(i);
    }

    Spliterator<Integer> spliterator1 = numbers.spliterator();
    Spliterator<Integer> spliterator2 = spliterator1.trySplit();

        System.out.println("First Spliterator:");
        spliterator1.forEachRemaining(System.out::println);

        System.out.println("Second Spliterator:");
        spliterator2.forEachRemaining(System.out::println);
}}
/*

✔ Retrieves a spliterator from the collection
✔ Works similar to Iterator
✔ Supports bulk traversal

How trySplit() Works

✔ Divides the elements into two parts
✔ Enables parallel processing
✔ Order is not guaranteed

*/


