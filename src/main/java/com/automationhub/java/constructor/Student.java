package com.automationhub.java.constructor;

public class Student {

    private String name;
    private int rollNumber;
    private String address;

    // Constructor 1: No Arg constructor
    public Student() {
        // Calls Constructor 2 with a default name
        this("Unknown", 0);
        System.out.println("Executing No Arg Constructor");
    }

    // Constructor 2: Parameterized constructor for name and roll number
    public Student(String name, int rollNumber) {
        // Calls Constructor 3 with provided name, roll number, and default address
        this(name, rollNumber, "Not specified");
        System.out.println("Executing Constructor with Name and Roll Number");
    }

    // Constructor 3: Fully parameterized constructor (final initialization point)
    public Student(String name, int rollNumber, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
        System.out.println("Executing Full Parameterized Constructor");
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Address: " + address);
    }

    public static void main(String[] args) {
        // This single call triggers the entire chain
        Student s1 = new Student();
        s1.display();
    }
}
