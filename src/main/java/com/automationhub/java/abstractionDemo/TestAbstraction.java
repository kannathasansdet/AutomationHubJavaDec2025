package com.automationhub.java.abstractionDemo;

public class TestAbstraction {

    public static void main(String[] args) {

        //Vehicle v1 = new Vehicle(); // We can't Create a object for abstract class

        Vehicle v = new bike(); // Upcasting

        v.start();  // Car starts with key
        v.stop();
        v.fuel(); // Vehicle uses fuel
    }
}
