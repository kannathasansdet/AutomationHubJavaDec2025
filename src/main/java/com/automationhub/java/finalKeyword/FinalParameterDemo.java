package com.automationhub.java.finalKeyword;

class FinalParameterDemo {

    void calculate(final int x) {

        // x = x + 10;  // ❌ error

        System.out.println("Value: " + x);
    }

    public static void main(String[] args) {
        FinalParameterDemo obj = new FinalParameterDemo();
        obj.calculate(50);
    }
}
