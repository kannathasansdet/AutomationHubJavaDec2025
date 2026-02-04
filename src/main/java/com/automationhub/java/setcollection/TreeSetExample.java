package com.automationhub.java.setcollection;


import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");

        System.out.println(cities); // Sorted: [Bangalore, Delhi, Mumbai]

        TreeSet<Integer> age = new TreeSet<>();

        age.add(40);
        age.add(7);
        age.add(19);

        System.out.println(age); // Sorted: [7,19,40]


    }
}
