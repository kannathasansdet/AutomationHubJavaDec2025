package com.automationhub.java.interfaceconcepts;

interface Vehicle {
    int MAX_SPEED = 120;   // public static final

    void start();   // public abstract by default
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts with key");
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        System.out.println(v.MAX_SPEED);
    }
}

/*
❌ Removing public causes compile-time error.*/
