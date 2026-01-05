package com.automationhub.java.array;

public class StudentMarks3D {

    public static void main(String[] args) {
        // 2 semesters, 3 students, 3 subjects
        int[][][] marks = {
                {   // Semester 1
                        {85, 90, 78},   // Student 1
                        {88, 76, 95},   // Student 2
                        {90, 85, 88}    // Student 3
                },
                {   // Semester 2
                        {80, 70, 75},   // Student 1
                        {92, 89, 94},   // Student 2
                        {78, 85, 82}    // Student 3
                }
        };

        // Loop through semesters, students, and subjects
        for (int sem = 0; sem < marks.length; sem++) {
            System.out.println("Semester " + (sem + 1) + " Results:");
            for (int student = 0; student < marks[sem].length; student++) {
                int total = 0;
                for (int subject = 0; subject < marks[sem][student].length; subject++) {
                    total += marks[sem][student][subject];
                }
                int average = total / marks[sem][student].length;
                System.out.println("  Student " + (student + 1) +
                        " -> Total: " + total +
                        ", Average: " + average);
            }
            System.out.println();
        }
    }
}
