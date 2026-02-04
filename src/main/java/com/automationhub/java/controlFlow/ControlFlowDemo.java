package com.automationhub.java.controlFlow;

public class ControlFlowDemo {
    public static void main(String[] args) {
        int score = 85;

        // if-else example
        if(score >= 90) {
            System.out.println("Grade: A");
        } else if(score >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        // switch example
        char grade = 'B';
        switch(grade) {
            case 'A': System.out.println("Excellent!"); break;
            case 'B': System.out.println("Good job!"); break;
            case 'C': System.out.println("Keep trying."); break;
            default: System.out.println("Invalid grade.");
        }

        // for loop example
        System.out.println("For Loop:");
        for(int i = 1; i <= 4; i++) {
            System.out.println("Iteration " + i);
        }

        // while loop example
        int j = 1;
        System.out.println("While Loop:");
        while(j <= 3) {
            System.out.println("Count: " + j);
            j++;
        }

        // do-while loop example
        int k = 1;
        System.out.println("Do-While Loop:");
        do {
            System.out.println("Value: " + k);
            k++;
        } while(k <= 2);

        // continue and break example
        System.out.println("Continue and Break:");
        for(int m = 1; m <= 5; m++) {
            if(m == 3) continue;
            if(m == 5) break;
            System.out.println("Number: " + m);
        }
    }
}