package com.automationhub.java.operator;

public class NumberChecker {
    public static void main(String[] args) {
        int num = -15;

        String result = num == 0 ? "Zero" :
                num > 0 ? (num % 2 == 0 ? "Positive Even" : "Positive Odd") :
                        (num % 2 == 0 ? "Negative Even" : "Negative Odd");

        System.out.println(num + " is " + result); // Output: -15 is Negative Odd
    }
}