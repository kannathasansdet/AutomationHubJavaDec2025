package com.automationhub.java.wrapperclass;

import java.util.ArrayList;

class Student {

    Integer age;      // wrapper class
    Double marks;     // wrapper class

    Student(Integer age, Double marks) {
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
    }
}

public class WrapperClassExample {

    public static void main(String[] args) {

        // 1️⃣ Input from user / file (String)
        String ageInput = "21";
        String marksInput = "88.5";

        // 2️⃣ Convert String → primitive using wrapper methods
        int age = Integer.parseInt(ageInput);
        double marks = Double.parseDouble(marksInput);

        // 3️⃣ Autoboxing (primitive → wrapper)
        Student s1 = new Student(age, marks);

        // 4️⃣ Collection usage
        ArrayList<Integer> ageList = new ArrayList<>();
        ageList.add(age);   // autoboxing
        ageList.add(null);  // allowed

        // 5️⃣ Display data
        s1.display();

        // 6️⃣ Wrapper utility methods
        System.out.println("Max int value: " + Integer.MAX_VALUE);
        System.out.println("Is '7' a digit? " + Character.isDigit('7'));
    }
}


/*
Problems with primitives ❌
int a = 10;
a.toString();        // ❌ primitives have no methods
int b = null;        // ❌ cannot store null
ArrayList<int> list; // ❌ collections don’t allow primitives

Wrapper classes solve these problems ✅*/
