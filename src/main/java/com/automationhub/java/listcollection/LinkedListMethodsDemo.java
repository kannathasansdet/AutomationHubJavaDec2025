package com.automationhub.java.listcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethodsDemo {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

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

        // 6. remove(Object o) - Remove first occurrence
        list.remove("Cherry");
        System.out.println("After remove(Object): " + list);

        // 7. contains(Object o) - Check if element exists
        System.out.println("Contains Apple? " + list.contains("Apple"));

        // 8. size() - Number of elements
        System.out.println("Size of list: " + list.size());

        // 9. isEmpty() - Check if empty
        System.out.println("Is list empty? " + list.isEmpty());

        // 10. indexOf(Object o) - First occurrence
        list.add("Apple");
        System.out.println("After adding another Apple: " + list);
        System.out.println("First index of Apple: " + list.indexOf("Apple"));

        // 11. lastIndexOf(Object o) - Last occurrence
        System.out.println("Last index of Apple: " + list.lastIndexOf("Apple"));

        // 12. subList(int fromIndex, int toIndex)
        System.out.println("SubList (0 to 2): " + list.subList(0, 2));

        // 13. addAll(Collection c)
        List<String> newFruits = new ArrayList<>();
        newFruits.add("Pineapple");
        newFruits.add("Orange");
        list.addAll(newFruits);
        System.out.println("After addAll(): " + list);

        // 14. removeAll(Collection c)
        list.removeAll(Collections.singleton("Apple"));
        System.out.println("After removeAll(Apple): " + list);

        // 15. retainAll(Collection c)
        list.retainAll(Collections.singleton("Pineapple"));
        System.out.println("After retainAll(Pineapple): " + list);

        // 16. clear()
        list.clear();
        System.out.println("After clear(): " + list);

        // ---- LinkedList Specific Methods ----
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("\nCurrent List: " + list);

        // 17. addFirst(E e)
        list.addFirst("Start");
        System.out.println("After addFirst(): " + list);

        // 18. addLast(E e)
        list.addLast("End");
        System.out.println("After addLast(): " + list);

        // 19. getFirst()
        System.out.println("First element: " + list.getFirst());

        // 20. getLast()
        System.out.println("Last element: " + list.getLast());

        // 21. removeFirst()
        list.removeFirst();
        System.out.println("After removeFirst(): " + list);

        // 22. removeLast()
        list.removeLast();
        System.out.println("After removeLast(): " + list);

    }
}
