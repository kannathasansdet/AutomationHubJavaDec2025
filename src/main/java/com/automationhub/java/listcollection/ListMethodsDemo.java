package com.automationhub.java.listcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethodsDemo {
    public static void main(String[] args) {
        // Creating a List
        List<String> oldFruitslist = new ArrayList<>();

        // 1. add(E e) - Add element at end
        oldFruitslist.add("Apple");
        oldFruitslist.add("Banana");
        oldFruitslist.add("Cherry");
        System.out.println("After add(): " + oldFruitslist);

        // 2. add(int index, E element) - Add at specific index
        oldFruitslist.add(1, "Mango");
        System.out.println("After add(index, element): " + oldFruitslist);

        // 3. get(int index) - Access element by index
        System.out.println("Element at index 2: " + oldFruitslist.get(2));

        // 4. set(int index, E element) - Replace element
        oldFruitslist.set(2, "Grapes");
        System.out.println("After set(): " + oldFruitslist);

        // 5. remove(int index) - Remove element by index
        oldFruitslist.remove(1);
        System.out.println("After remove(index): " + oldFruitslist);

        // 6. remove(Object o) - Remove first occurrence of element
        oldFruitslist.remove("Cherry");
        System.out.println("After remove(Object): " + oldFruitslist);

        // 7. contains(Object o) - Check if element exists
        System.out.println("Contains Apple? " + oldFruitslist.contains("Apple"));

        // 8. size() - Number of elements
        System.out.println("Size of list: " + oldFruitslist.size());

        // 9. isEmpty() - Check if list is empty
        System.out.println("Is list empty? " + oldFruitslist.isEmpty());

        // 10. indexOf(Object o) - First occurrence index
        oldFruitslist.add("Apple");
        System.out.println("After adding another Apple: " + oldFruitslist);
        System.out.println("First index of Apple: " + oldFruitslist.indexOf("Apple"));

        // 11. lastIndexOf(Object o) - Last occurrence index
        System.out.println("Last index of Apple: " + oldFruitslist.lastIndexOf("Apple"));

        // 12. subList(int fromIndex, int toIndex) - View part of the list
        System.out.println("SubList (0 to 2): " + oldFruitslist.subList(0, 2));

        // 13. addAll(Collection c) - Add another collection
        List<String> newFruits = new ArrayList<>();
        newFruits.add("Pineapple");
        newFruits.add("Orange");


        oldFruitslist.addAll(newFruits);
        System.out.println("After addAll(): " + oldFruitslist);

        // 14. removeAll(Collection c) - Remove all elements in given collection
        oldFruitslist.removeAll(Collections.singleton("Apple"));
        System.out.println("After removeAll(Apple): " + oldFruitslist);

        // 15. retainAll(Collection c) - Keep only elements in given collection
        oldFruitslist.retainAll(Collections.singleton("Pineapple"));
        System.out.println("After retainAll(Pineapple): " + oldFruitslist);

        // 16. clear() - Remove all elements
        oldFruitslist.clear();
        System.out.println("After clear(): " + oldFruitslist);



    }
}
