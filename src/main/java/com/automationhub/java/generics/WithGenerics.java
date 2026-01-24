package com.automationhub.java.generics;

import java.util.ArrayList;

public class WithGenerics {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(); // Only Strings allowed
        list.add("Hello");
       //  list.add(100); // ❌ Compile-time error

        String str = list.get(0); // ✅ No casting needed
        System.out.println(str);
    }
}
