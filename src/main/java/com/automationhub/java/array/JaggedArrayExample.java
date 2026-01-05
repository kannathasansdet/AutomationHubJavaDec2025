package com.automationhub.java.array;

public class JaggedArrayExample {
    public static void main(String[] args) {
        // Step 1: Declare a jagged array with 3 rows but no fixed columns
        int[][] studentScores = new int[3][];

        // Step 2: Initialize each row with different column sizes
        studentScores[0] = new int[3]; // Student 0 has 3 subjects
        studentScores[1] = new int[2]; // Student 1 has 2 subjects
        studentScores[2] = new int[4]; // Student 2 has 4 subjects

        // Step 3: Assign values
        studentScores[0][0] = 85;
        studentScores[0][1] = 90;
        studentScores[0][2] = 78;

        studentScores[1][0] = 92;
        studentScores[1][1] = 88;

        studentScores[2][0] = 70;
        studentScores[2][1] = 80;
        studentScores[2][2] = 85;
        studentScores[2][3] = 90;

        // Step 4: Print the jagged array
        System.out.println("Jagged Array Contents:");
        for (int i = 0; i < studentScores.length; i++) {
            System.out.print("Student " + i + ": ");
            for (int j = 0; j < studentScores[i].length; j++) {
                System.out.print(studentScores[i][j] + " ");
            }
            System.out.println();
        }
    }
}