package com.automationhub.java.setcollection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);

        System.out.println(numbers); // Maintains insertion order: [10, 5, 20]
    }
}
