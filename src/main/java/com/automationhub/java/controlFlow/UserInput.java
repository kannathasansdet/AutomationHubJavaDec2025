package com.automationhub.java.controlFlow;

import java.util.Scanner;
import java.util.SortedMap;

public class UserInput {
    public static void main(String[] args)
    {
// Create an object of Scanner class to take inputs for three subjects.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student Name:");
        String name = sc.next();

        System.out.println("Enter your physics marks:");
        int phyMark = sc.nextInt();

        System.out.println("Enter your chemistry marks:");
        int chemMark = sc.nextInt();

        System.out.println("Enter your maths marks:");
        int mathsMark = sc.nextInt();

        float total = phyMark + chemMark + mathsMark;
        float myPer = total/3;

        System.out.println("Your percentage: " +myPer);
        System.out.println("Name of the student "+name);

        if(myPer >= 85.0) // Here, if the specified condition is true, the below statement will execute.
            System.out.println("Grade A");
    }
}