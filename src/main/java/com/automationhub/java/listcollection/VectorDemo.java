package com.automationhub.java.listcollection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Create Vector
        Vector<String> vector = new Vector<>();

        // 1. add(E e)
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        System.out.println("After add(): " + vector);

        // 2. add(int index, E element)
        vector.add(1, "Mango");
        System.out.println("After add(index, element): " + vector);

        // 3. get(int index)
        System.out.println("Element at index 2: " + vector.get(2));

        // 4. set(int index, E element)
        vector.set(2, "Grapes");
        System.out.println("After set(): " + vector);

        // 5. remove(int index)
        vector.remove(1);
        System.out.println("After remove(index): " + vector);

        // 6. remove(Object o)
        vector.remove("Cherry");
        System.out.println("After remove(Object): " + vector);

        // 7. contains(Object o)
        System.out.println("Contains Apple? " + vector.contains("Apple"));

        // 8. size()
        System.out.println("Size of vector: " + vector.size());

        // 9. capacity()
        System.out.println("Capacity of vector: " + vector.capacity());

        // 10. firstElement()
        System.out.println("First element: " + vector.firstElement());

        // 11. lastElement()
        System.out.println("Last element: " + vector.lastElement());

        // 12. isEmpty()
        System.out.println("Is vector empty? " + vector.isEmpty());

        // 13. indexOf(Object o)
        System.out.println("Index of Apple: " + vector.indexOf("Apple"));

        // 14. clear()
        vector.clear();
        System.out.println("After clear(): " + vector);
    }
}
