package com.automationhub.java.listcollection;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteExample {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list =
                new CopyOnWriteArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        // No need for synchronized block
        for (String s : list) {
            System.out.println(s);
        }
    }
}
