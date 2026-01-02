package com.automationhub.java.array;

public class TwoDimensionalMonthlyTracker {
    public static void main(String[] args) {
        int[][] expenses = {
                {8000, 3000, 2000},
                {8000, 3200, 1800}
        };

        for(int i = 0; i < expenses.length; i++) {
            int sum = 0;
            for(int j = 0; j < expenses[i].length; j++) {
                sum += expenses[i][j];
            }
            System.out.println("Total expense for month " + (i+1) + " = " + sum);
        }

    }
}
