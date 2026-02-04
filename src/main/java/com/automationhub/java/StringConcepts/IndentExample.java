package com.automationhub.java.StringConcepts;

public class IndentExample {
    public static void main(String[] args) {
        String str = "Java\nProgramming";
        System.out.println(str.indent(4));
        /* Output:
           Java
           ....Programming
        */
    }
}

/*Explanation: Adds n spaces to the beginning of each line in the string.*/
