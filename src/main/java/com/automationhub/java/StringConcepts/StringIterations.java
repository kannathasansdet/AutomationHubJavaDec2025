package com.automationhub.java.StringConcepts;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class StringIterations {

    static String str = "Hello";

    public static void main(String[] args) {

        CharAtExample();
        ToCharArrayExample();
        CharacterIteratorExample();
    }

    public static void ToCharArrayExample() {
        /*char[] text = str.toCharArray();

        for(char c :text){
            System.out.println(c);
        }*/

        System.out.println("Using toCharArray() with for-each:");
        for (char ch : str.toCharArray()) {
            System.out.println(ch);
        }
    }

    public static void CharAtExample() {

        System.out.println("Using charAt() with for loop:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }


    public static void CharacterIteratorExample() {
        System.out.println("Using CharacterIterator:");

        CharacterIterator it = new StringCharacterIterator(str);

        while (it.current() != CharacterIterator.DONE) {
            System.out.println(it.current());
            it.next();
        }
    }
}






