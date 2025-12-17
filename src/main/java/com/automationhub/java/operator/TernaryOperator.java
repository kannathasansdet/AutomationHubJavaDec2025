package com.automationhub.java.operator;

public class TernaryOperator {
    public static void main(String[] args) {

        int age = 17;

        // Ternary equivalent
        String ternaryStatus = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Ternary Result: " + ternaryStatus);// Adult

        int mark = 35;
        String result = mark>=35 ? "PASS" : "FAIL";
        System.out.println(result);

        // 18 to 65

        int ages = 18;
        String eligibility = (ages>=18 && ages<=65) ? "Eligiblie" : "not Eligible";
        System.out.println(eligibility);
    }
}