package com.automationhub.java.abstractionDemo;

// Abstract class
public abstract class Vehicle {

    // Abstract method
    abstract void start();

    abstract void stop();

    // Non-abstract method
    void fuel() {
        System.out.println("Vehicle uses fuel");
    }
}
