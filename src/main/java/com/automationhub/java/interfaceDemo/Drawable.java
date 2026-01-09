package com.automationhub.java.interfaceDemo;

// Define the Interface (Contract)
public interface Drawable {

    void draw();// Abstract method

    static void printInfo() { // Static method (Java 8+)

        System.out.println("This is a drawable object.");
    }
}

