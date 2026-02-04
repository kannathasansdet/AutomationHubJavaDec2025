package com.automationhub.java.setcollection;

import java.util.*;

public class SetMethodsDemo {
    public static void main(String[] args) {

        // 1. HASHSET DEMO ---------------------------------
        System.out.println("=== HASHSET DEMO ===");
        Set<String> hashSet = new HashSet<>();

        // add() - Add elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Mango");
        hashSet.add("Banana"); // duplicate ignored
        System.out.println("HashSet after add(): " + hashSet);

        // contains() - Check if element exists
        System.out.println("Contains Mango? " + hashSet.contains("Mango"));

        // remove() - Remove an element
        hashSet.remove("Apple");
        System.out.println("After removing Apple: " + hashSet);

        // size() - Get number of elements
        System.out.println("Size: " + hashSet.size());

        // isEmpty()
        System.out.println("Is empty? " + hashSet.isEmpty());

        // addAll() - Add another collection
        Set<String> tropicalFruits = new HashSet<>();
        tropicalFruits.add("Pinapple");
        tropicalFruits.add("Chickoo");
        hashSet.addAll(tropicalFruits);

        System.out.println("After addAll(): " + hashSet);

        // retainAll() - Keep only common elements
        Set<String> commonFruits = new HashSet<>(Arrays.asList("Banana", "Papaya"));
        hashSet.retainAll(commonFruits);
        System.out.println("After retainAll(commonFruits): " + hashSet);

        // removeAll() - Remove all elements from another set
        hashSet.removeAll(commonFruits);
        System.out.println("After removeAll(commonFruits): " + hashSet);

        // clear() - Remove all elements
        hashSet.clear();
        System.out.println("After clear(): " + hashSet);
        System.out.println();


        // 2. LINKEDHASHSET DEMO ---------------------------------
        System.out.println("=== LINKEDHASHSET DEMO ===");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(10);
        linkedHashSet.add(5);
        linkedHashSet.add(20);
        linkedHashSet.add(15);
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);

        linkedHashSet.remove(5);
        System.out.println("After removing 5: " + linkedHashSet);

        // Maintains insertion order
        for (Integer num : linkedHashSet) {
            System.out.println("Iterating: " + num);
        }
        System.out.println();


        // 3. TREESET DEMO ---------------------------------
        System.out.println("=== TREESET DEMO ===");
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Delhi");
        treeSet.add("Mumbai");
        treeSet.add("Bangalore");
        treeSet.add("Chennai");
        System.out.println("TreeSet (sorted order): " + treeSet);

        // first(), last() - Only available in TreeSet
        System.out.println("First: " +  ((TreeSet<String>) treeSet).first());
        System.out.println("Last: " + ((TreeSet<String>) treeSet).last());

        // headSet(), tailSet(), subSet() - Ranges
        System.out.println("HeadSet(before Mumbai): " + ((TreeSet<String>) treeSet).headSet("Mumbai"));
        System.out.println("TailSet(from Mumbai): " + ((TreeSet<String>) treeSet).tailSet("Mumbai"));
        System.out.println("SubSet(Bangalore to Mumbai): " + ((TreeSet<String>) treeSet).subSet("Bangalore", "Mumbai"));

        // Remove and iterate
        treeSet.remove("Delhi");
        for (String city : treeSet) {
            System.out.println("City: " + city);
        }
    }
}
