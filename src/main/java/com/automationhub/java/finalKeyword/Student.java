package com.automationhub.java.finalKeyword;

public class Student {

    final String schoolName = "ABC School";

    void display() {
        System.out.println("School: " + schoolName);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}

/*
schoolName cannot be changed
Same value for all objects*/
