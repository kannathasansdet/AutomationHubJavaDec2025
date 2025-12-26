package com.automationhub.java.methods;

public class MethodDemo {

    // static method
    static void staticMethod() {
        System.out.println("This is a static method");
    }

    // instance method
    void instanceMethod() {
        System.out.println("This is an instance method");
    }

    // return type method
    int add(int a, int b) {
        return a + b;
    }

    // void method
    void greet() {
        System.out.println("Hello from void method!");
    }

    public static void main(String[] args) {

        // calling static method
        staticMethod();

        // creating object for instance methods
        MethodDemo obj = new MethodDemo();

        // calling instance method
        obj.instanceMethod();

        // calling return type method
        int result = obj.add(10, 20);
        System.out.println("Addition result: " + result);

        // calling void method
        obj.greet();
    }
}
