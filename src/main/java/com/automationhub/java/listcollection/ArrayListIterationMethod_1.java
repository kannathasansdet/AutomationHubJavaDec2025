package com.automationhub.java.listcollection;

import java.util.ArrayList;

public class ArrayListIterationMethod_1 {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        int sizeofthearray = cars.size();

        System.out.println(sizeofthearray);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}

