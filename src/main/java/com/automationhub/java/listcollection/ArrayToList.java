package com.automationhub.java.listcollection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        // Array
        String[] fruitsArray = {"Apple", "Banana", "Mango"};


        // Convert to List
        List<String> fruitsList = Arrays.asList(fruitsArray);

        System.out.println(fruitsArray[0]);

        System.out.println("Array: " + Arrays.toString(fruitsArray));
        System.out.println("List: " + fruitsList);
    }
}
