package com.automationhub.java.StringConcepts;

public class StringDemoClass {

    static String str1 = " Kanna "; //literal Way of creating string

    static String Str3 = "KaNNa";

    static String str2 = new String("Kanna"); //Using New keyword

    static String str4 = new String("Kanna");

    static String str5 = str1 + "Thasan";


    public static void main(String[] args) {

        System.out.println(str1==str2); // Address Verification

        System.out.println(str1==Str3); // Address Verfication

        System.out.println(str1.equals(str2)); // Content Verification

        System.out.println(str1.equals(Str3)); // Content verification

        System.out.println(str5);

        System.out.println(str1.toLowerCase());

        System.out.println(str1.toUpperCase());

        System.out.println(str1.length());

        System.out.println(str1.charAt(0));

        System.out.println(str1.equals(Str3));

        System.out.println(str1.equalsIgnoreCase(Str3));

        System.out.println(str1.startsWith("L"));

        System.out.println(str1.endsWith("N"));

        System.out.println(str1.contains("nna"));

        System.out.println(str1.indexOf("K"));
        System.out.println(str1.lastIndexOf("n"));

        System.out.println(str1.substring(1));

        System.out.println(str1.substring(1,5));

        System.out.println(str1.trim());

        String str7 = str1.trim();

        System.out.println(str7.replace('a','@'));

    }
}
