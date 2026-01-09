package com.automationhub.java.interfaceconcepts;

@FunctionalInterface
interface Calculator {
    int add(int a, int b);

}

class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        Calculator c = (a, b) -> a + b;
        System.out.println(c.add(10, 20));
    }
}
