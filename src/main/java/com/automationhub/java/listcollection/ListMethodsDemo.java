package com.automationhub.java.listcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethodsDemo {
    public static void main(String[] args) {
        // Creating a List
        List<String> list = new ArrayList<>();

        // 1. add(E e) - Add element at end
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After add(): " + list);

        // 2. add(int index, E element) - Add at specific index
        list.add(1, "Mango");
        System.out.println("After add(index, element): " + list);

        // 3. get(int index) - Access element by index
        System.out.println("Element at index 2: " + list.get(2));

        // 4. set(int index, E element) - Replace element
        list.set(2, "Grapes");
        System.out.println("After set(): " + list);

        // 5. remove(int index) - Remove element by index
        list.remove(1);
        System.out.println("After remove(index): " + list);

        // 6. remove(Object o) - Remove first occurrence of element
        list.remove("Cherry");
        System.out.println("After remove(Object): " + list);

        // 7. contains(Object o) - Check if element exists
        System.out.println("Contains Apple? " + list.contains("Apple"));

        // 8. size() - Number of elements
        System.out.println("Size of list: " + list.size());

        // 9. isEmpty() - Check if list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // 10. indexOf(Object o) - First occurrence index
        list.add("Apple");
        System.out.println("After adding another Apple: " + list);
        System.out.println("First index of Apple: " + list.indexOf("Apple"));

        // 11. lastIndexOf(Object o) - Last occurrence index
        System.out.println("Last index of Apple: " + list.lastIndexOf("Apple"));

        // 12. subList(int fromIndex, int toIndex) - View part of the list
        System.out.println("SubList (0 to 2): " + list.subList(0, 2));

        // 13. addAll(Collection c) - Add another collection
        List<String> newFruits = new ArrayList<>();
        newFruits.add("Pineapple");
        newFruits.add("Orange");


        list.addAll(newFruits);
        System.out.println("After addAll(): " + list);

        // 14. removeAll(Collection c) - Remove all elements in given collection
        list.removeAll(Collections.singleton("Apple"));
        System.out.println("After removeAll(Apple): " + list);

        // 15. retainAll(Collection c) - Keep only elements in given collection
        list.retainAll(Collections.singleton("Pineapple"));
        System.out.println("After retainAll(Pineapple): " + list);

        // 16. clear() - Remove all elements
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
