package com.automationhub.java.controlFlow;

public class SwitchDemo {

    public static void addition() {

        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println(c);

    }

    public static void main(String[] args) {

        SwitchDemo obj = new SwitchDemo();

        SwitchDemo.addition();

    }


}

    /*int choice = 2;
    String productName;

    productName = switch (choice) {
        case 1 : yield  "Rahul gets Vanilla";
        case 2 : yield "Rahul gets Chocolate";
        case 3 : yield "Rahul gets Strawberry";
        case 4 : yield  "Rahul gets Mango";
        default : yield "Invalid choice";
    };

        System.out.println(productName);
}*/