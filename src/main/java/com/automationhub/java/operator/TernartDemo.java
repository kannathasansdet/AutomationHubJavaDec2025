package com.automationhub.java.operator;

public class TernartDemo {

    public static void main(String[] args) {

        int mark=34;

        String result = (mark>=35) ? "PASS" : "FAIL";

        System.out.println("The Student Result " + result);

        String Name = "Kanna";

        int age = (Name.equalsIgnoreCase("Kanna")) ? 30 : 40;

        System.out.println(age);

    }
}
