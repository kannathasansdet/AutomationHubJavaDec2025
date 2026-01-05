package com.automationhub.java.array;

public class ThreeDArrayBasicDemo {

    public static void main(String[] args) {

    int[][][] marks = {
            {   // Class 1 (Sheet 1)
                    {80, 75},   // Student 1
                    {85, 78}    // Student 2
            },
            {   // Class 2 (Sheet 2)
                    {88, 82},
                    {90, 85}
            },
            {   // Class 3 (Sheet 3)
                    {70, 65},
                    {75, 72}
            }
    };

        for (int i = 0; i < marks.length; i++) {           // Sheets (Classes)
            for (int j = 0; j < marks[i].length; j++) {    // Rows (Students)
                for (int k = 0; k < marks[i][j].length; k++) { // Columns (Subjects)
                    System.out.print(marks[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("-----");
        }


    }}
