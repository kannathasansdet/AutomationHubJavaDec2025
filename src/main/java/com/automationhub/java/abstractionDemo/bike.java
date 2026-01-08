package com.automationhub.java.abstractionDemo;

public class bike extends Vehicle{

    @Override
    void start() {
        System.out.println("Car starts with key");
    }

    @Override
    void stop() {
        System.out.println("Car should stop");
    }

    void engin(){

        System.out.println("Engin should start after key insert");
    }


}
