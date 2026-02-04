package com.automationhub.java.mapcollection;

import java.util.HashMap;
import java.util.Map;

public class MapMethodsDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // put()
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");  //map.put(3,null) - if incase the value is NULL we can resign the value


        // putIfAbsent()
        map.putIfAbsent(3, "React");
        map.putIfAbsent(4, "JavaScript");

        System.out.println(map);

        // get()
        System.out.println("Get key 1: " + map.get(1));

        // getOrDefault()
        System.out.println("Get key 10: " + map.getOrDefault(10, "Not Found"));

        // containsKey & containsValue
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value Java? " + map.containsValue("Java"));

        // size & isEmpty
        System.out.println("Size: " + map.size());
        System.out.println("Is Empty? " + map.isEmpty());

        // replace
        map.replace(2, "Python 3");
        map.replace(3, "C++", "C++17");

        // compute
        map.compute(1, (k, v) -> v + " Course");

        // computeIfAbsent
        map.computeIfAbsent(5, k -> "Spring");

        // computeIfPresent
        map.computeIfPresent(4, (k, v) -> v + " ES6");

        // merge
        map.merge(1, " Boot", (oldVal, newVal) -> oldVal + newVal);

        // Iteration using forEach
        System.out.println("\nFinal Map Data:");
        map.forEach((k, v) -> System.out.println(k + " = " + v));

        // remove
        map.remove(3);
        map.remove(4, "JavaScript ES6");

        // clear
        // map.clear();
    }
}
