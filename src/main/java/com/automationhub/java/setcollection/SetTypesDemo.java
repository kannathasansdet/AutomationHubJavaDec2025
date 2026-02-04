package com.automationhub.java.setcollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTypesDemo {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();

        HashSet<Integer> h1 = new HashSet<>();

        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        String[] data = {"Banana", "Apple", "Orange"};

        for (String item : data) {
            hashSet.add(item);
            linkedHashSet.add(item);
            treeSet.add(item);
        }

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
