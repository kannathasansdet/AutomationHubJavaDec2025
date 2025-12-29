package com.automationhub.java.StringConcepts;

public class StringSplitting {
    public static void main(String[] args) {

        String str = "apple banana orange";

        String[] fruits = str.split(" ");

       /* fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "orange";*/

        System.out.println("Fruits:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

       /* for (int i=0;i<fruits.length;i++){

            System.out.println(fruits[i]);
        }*/

                String sentence = "Java is a powerful language";
                // Split by one or more whitespace characters
                String[] words = sentence.split("\\s+");


        System.out.println("Original string: \"" + sentence + "\"");
        System.out.println("Resulting substrings:");

                for (String word : words) {
                    System.out.println(word);
                }
            }
        }



/*
Explanation:
split(regex) splits the string into an array of substrings based on the given regular expression.*/
