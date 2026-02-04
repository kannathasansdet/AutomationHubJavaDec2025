package com.automationhub.java.StringConcepts;

public class StringEmptyVsBlankDemo {

    public static void main(String[] args) {

        String s1 = "";
        String s2 = " ";
        String s3 = "   ";
        String s4 = "Java";
        String s5 = "\t\n";

        checkString(s1, "s1");
        checkString(s2, "s2");
        checkString(s3, "s3");
        checkString(s4, "s4");
        checkString(s5, "s5");
    }

    public static void checkString(String str, String name) {

        System.out.println("Checking " + name);

        System.out.println("Value: [" + str + "]");
        System.out.println("isEmpty(): " + str.isEmpty());
        System.out.println("isBlank(): " + str.isBlank());

        System.out.println("--------------------------");
    }
}
