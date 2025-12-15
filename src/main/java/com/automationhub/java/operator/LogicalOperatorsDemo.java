package com.automationhub.java.operator;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {

        boolean isRaining = true;
        boolean isSunny = false;
        boolean isWeekend = true;

        // Logical AND (&&)
        System.out.println("Should I stay indoors? " + (isRaining && isSunny)); // false

        // Logical OR (||)
        System.out.println("Can I go outside? " + (isSunny || isWeekend)); // true

        // Logical NOT (!)
        System.out.println("Is it NOT raining? " + (!isRaining)); // false
    }
}