package com.automationhub.java.abstraction;

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }

    public void stop() {
        System.out.println("Bike is stopping...");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();

        System.out.println();

        Vehicle myBike = new Bike();
        myBike.start();
        myBike.stop();
    }
}

