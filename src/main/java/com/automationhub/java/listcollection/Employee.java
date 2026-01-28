package com.automationhub.java.listcollection;

public class Employee {

    int id;
    String name;
    double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println(id + " | " + name + " | " + salary);
    }

}
