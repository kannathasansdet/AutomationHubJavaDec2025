package com.automationhub.java.listcollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListMutable {
    public static void main(String[] args) {

        String[] fruitsArray = {"Apple", "Banana", "Mango"};

        // Convert to mutable list
        List<String> fruitsList = new ArrayList<>(Arrays.asList(fruitsArray));

        // Now we can add/remove elements
        fruitsList.add("Orange");
        fruitsList.remove("Banana");

        System.out.println("List (Mutable): " + fruitsList);
    }
}
