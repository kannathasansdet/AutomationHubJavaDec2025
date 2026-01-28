package com.automationhub.java.listcollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListCompleteExample {

    public static void main(String[] args) {

        // -------------------------------
        // 1. Creating LinkedList
        // -------------------------------
        LinkedList<String> list = new LinkedList<>();

        // -------------------------------
        // 2. Adding Elements
        // -------------------------------
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("After add(): " + list);

        list.add(1, "X");
        System.out.println("After add(index, element): " + list);

        list.addFirst("Start");
        list.addLast("End");
        System.out.println("After addFirst & addLast: " + list);

        // -------------------------------
        // 3. Accessing Elements
        // -------------------------------
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());
        System.out.println("get(2): " + list.get(2));

        // -------------------------------
        // 4. Updating Elements
        // -------------------------------
        list.set(2, "Y");
        System.out.println("After set(): " + list);

        // -------------------------------
        // 5. Removing Elements
        // -------------------------------
        list.remove();           // removes first element
        list.remove("B");        // removes specific element
        list.remove(2);          // removes by index
        System.out.println("After remove(): " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst & removeLast: " + list);

        // -------------------------------
        // 6. Queue Operations (FIFO)
        // -------------------------------
        list.offer("Q1");
        list.offer("Q2");
        System.out.println("After offer(): " + list);

        System.out.println("peek(): " + list.peek());
        System.out.println("poll(): " + list.poll());
        System.out.println("After poll(): " + list);

        // -------------------------------
        // 7. Deque Operations
        // -------------------------------
        list.offerFirst("F1");
        list.offerLast("L1");
        System.out.println("After offerFirst & offerLast: " + list);

        System.out.println("peekFirst(): " + list.peekFirst());
        System.out.println("peekLast(): " + list.peekLast());

        System.out.println("pollFirst(): " + list.pollFirst());
        System.out.println("pollLast(): " + list.pollLast());
        System.out.println("After pollFirst & pollLast: " + list);

        // -------------------------------
        // 8. Stack Operations (LIFO)
        // -------------------------------
        list.push("Top1");
        list.push("Top2");
        System.out.println("After push(): " + list);

        System.out.println("pop(): " + list.pop());
        System.out.println("After pop(): " + list);

        // -------------------------------
        // 9. Searching Methods
        // -------------------------------
        System.out.println("contains(\"A\"): " + list.contains("A"));
        System.out.println("indexOf(\"A\"): " + list.indexOf("A"));
        System.out.println("lastIndexOf(\"A\"): " + list.lastIndexOf("A"));

        // -------------------------------
        // 10. Size & Empty Check
        // -------------------------------
        System.out.println("size(): " + list.size());
        System.out.println("isEmpty(): " + list.isEmpty());

        // -------------------------------
        // 11. Iteration Methods
        // -------------------------------
        System.out.println("\nUsing Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsing ListIterator (Forward):");
        ListIterator<String> listIt = list.listIterator();
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        System.out.println("\nUsing ListIterator (Backward):");
        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }

        System.out.println("\nUsing Descending Iterator:");
        Iterator<String> descIt = list.descendingIterator();
        while (descIt.hasNext()) {
            System.out.println(descIt.next());
        }

        // -------------------------------
        // 12. Conversion
        // -------------------------------
        Object[] arr = list.toArray();
        System.out.println("\nConverted to Array:");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // -------------------------------
        // 13. Clear List
        // -------------------------------
        list.clear();
        System.out.println("\nAfter clear(): " + list);
        System.out.println("isEmpty(): " + list.isEmpty());
    }
}
