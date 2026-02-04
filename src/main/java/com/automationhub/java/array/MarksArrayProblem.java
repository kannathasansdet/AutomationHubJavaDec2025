package com.automationhub.java.array;

public class MarksArrayProblem {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] marks = {85, 72, 90, 65, 88};

        // Access the third student's marks
        System.out.println("Third student's marks: " + marks[2]);

        // Calculate average using a loop
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i]; // total = total +marks[i]
        }
        double average = (double) total / marks.length;
        System.out.println("Average marks: " + average);
    }
}
