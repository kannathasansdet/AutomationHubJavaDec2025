package com.automationhub.java.wrapperclass;

import java.util.ArrayList;

public class AutoBoxingExample {

    public static void main(String[] args) {

        // 1️⃣ Autoboxing: primitive → wrapper
        int m1 = 80;
        int m2 = 90;

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(m1);   // autoboxing
        marks.add(m2);   // autoboxing

        // 2️⃣ Unboxing: wrapper → d4esxw

        int total = 0;
        for (Integer m : marks) {
            total += m;  // unboxing
        }

        System.out.println("Total Marks = " + total);
    }
}
