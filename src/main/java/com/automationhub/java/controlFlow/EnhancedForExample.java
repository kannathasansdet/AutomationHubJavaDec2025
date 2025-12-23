package com.automationhub.java.controlFlow;

public class EnhancedForExample {

    public static void main(String[] args) {
/*
        for (dataType variable : arrayOrCollection) {
            // code to be executed for each element
        }*/


        int[] numbers = {10, 20, 30, 40};

        String[] names = {"kanna", "Anu", "Diyu", "Hari"};

        char[] initials = {'E','R','K','H'};

        for (char initial : initials)
        {
            System.out.println("The initial is " + initial);
        }

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        for(String name :names)
        {
            System.out.println("The name is "+name);
        }

        int [] marks = {79,90,89};

        for(int mark : marks){
            System.out.println(mark);
        }
    }
}
