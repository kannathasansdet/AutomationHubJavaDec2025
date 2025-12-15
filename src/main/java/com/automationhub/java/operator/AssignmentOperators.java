package com.automationhub.java.operator;


public class AssignmentOperators {
    public static void main(String[] args) {
        int num = 10;

        // Simple assignment
        System.out.println("Original value: " + num); // 10


        // Compound assignment operators
        num += 5;  // num = num + 5
        System.out.println("After += 5: " + num);    // 15

        num -= 3;  // num = num - 3
        System.out.println("After -= 3: " + num);    // 12

        num *= 2;  // num = num * 2
        System.out.println("After *= 2: " + num);    // 24

        num /= 4;  // num = num / 4
        System.out.println("After /= 4: " + num);    // 6

        num %= 5;  // num = num % 5
        System.out.println("After %= 5: " + num);    // 1
    }
}