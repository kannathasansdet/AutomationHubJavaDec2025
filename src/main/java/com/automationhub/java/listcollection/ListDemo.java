package com.automationhub.java.listcollection;
import java.util.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {


        // 1. ArrayList
        List<String> fruitsList = new ArrayList<String>();

        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Banana");
        fruitsList.add(null);// duplicates allowed
        System.out.println("ArrayList: " + fruitsList);

        // 2. LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Car");
        linkedList.add("Bike");
        linkedList.add("Bus");
        System.out.println("LinkedList: " + linkedList);

        // Accessing elements using index
        System.out.println("First element in ArrayList: " + fruitsList.get(0));

        // Modifying elements
        fruitsList.set(1, "Mango");
        System.out.println("After modification: " + fruitsList);


        // Removing elements
        fruitsList.remove("Apple"); // removes first occurrence
        System.out.println("After removal: " + fruitsList);

        // Using index elements

        fruitsList.remove(2);

        System.out.println("After removal: " + fruitsList);

        // Checking existence
        System.out.println("Contains Mango? " + fruitsList.contains("Mango"));
    }
}
