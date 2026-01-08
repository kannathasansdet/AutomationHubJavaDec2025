package com.automationhub.java.constructor;

public class ConstructorOverloading {
    String name;
    int id;
    double salary;
    
    // No-arg constructor
    public ConstructorOverloading() {
        this.name = "New Employee";
        this.id = 0;
        this.salary = 0.0;
    }
    
    // Parameterized constructor (partial)
    public ConstructorOverloading(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 50000.0; // Default salary
    }
    
    // Fully parameterized constructor
    public ConstructorOverloading(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public static void main(String[] args) {
    	ConstructorOverloading e1 = new ConstructorOverloading(); // No-arg
    	ConstructorOverloading e2 = new ConstructorOverloading("John", 1001); // Partial
    	ConstructorOverloading e3 = new ConstructorOverloading("Alice", 1002, 75000.0); // Full
    }
}