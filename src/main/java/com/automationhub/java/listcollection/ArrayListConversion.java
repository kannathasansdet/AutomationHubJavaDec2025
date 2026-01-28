package com.automationhub.java.listcollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConversion {
    public static void main(String[] args) {
        // Array to List
        String[] colorsArray = {"Red", "Green", "Blue"};

        List<String> colorsList = new ArrayList<>(Arrays.asList(colorsArray));

        System.out.println("Array → List: " + colorsList);

        // Modify List
        colorsList.add("Yellow");

        // List to Array
        String[] newArray = colorsList.toArray(new String[0]);
        System.out.println("List → Array: " + Arrays.toString(newArray));
    }
}
