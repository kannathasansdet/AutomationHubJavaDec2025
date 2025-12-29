package com.automationhub.java.StringConcepts;

public class StringReplacement {

    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println("Replaced string: " + str.replace("Java", "Python"));

        String replacedChar = str.replace('a', 'o');
        System.out.println("Replaced char: " + replacedChar);
    }
}

/*
Explanation:
replace(oldChar, newChar) replaces all occurrences of oldChar with newChar.
replace(CharSequence target, CharSequence replacement) replaces all occurrences of target with replacement.*/
