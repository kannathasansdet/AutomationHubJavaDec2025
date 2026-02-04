package com.automationhub.java.StringConcepts;


public class StringBuilderExampleDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Test");

        sb.append("ing StringBuilder");
        System.out.println(sb);  // Testing StringBuilder

        sb.replace(0, 4, "Try");
        System.out.println(sb);  // Trying StringBuilder

        sb.reverse();
        System.out.println(sb);  // redliuBgnirtS gniyrT
    }
}
