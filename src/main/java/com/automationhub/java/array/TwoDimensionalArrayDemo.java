package com.automationhub.java.array;

public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {
        int[][] marks = {{80, 75, 90},
                {85, 88, 92},
                {70, 65, 78},
                {89, 89, 90}};

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < marks.length; i++) {
            int total = 0;
            for(int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            System.out.println("Total marks of Student " + (i+1) + " = " + total);
        }
    }
}

