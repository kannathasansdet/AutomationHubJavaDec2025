package com.automationhub.java.listcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample {

    public static void main(String[] args) {

        List<Integer> list =
                Collections.synchronizedList(new ArrayList<>());

        list.add(1);
        list.add(2);
        list.add(3);

        // Manual synchronization required during iteration
        synchronized (list) {
            for (Integer i : list) {
                System.out.println(i);
            }
        }
    }
}
