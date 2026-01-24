package com.automationhub.java.generics;
import java.util.ArrayList;

public class WithoutGenerics {

    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // No type defined
        list.add("Hello");
        list.add(100); // This is allowed — but dangerous!

        System.out.println(list.get(0));// Works fine
        System.out.println(list.get(1));
          }
}

