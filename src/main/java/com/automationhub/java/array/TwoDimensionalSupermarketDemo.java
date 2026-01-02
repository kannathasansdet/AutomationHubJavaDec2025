package com.automationhub.java.array;

public class TwoDimensionalSupermarketDemo {
    public static void main(String[] args) {
        int[][] sales = {
                {50, 30, 40},
                {45, 35, 38},
                {60, 40, 45}
        };

        for(int i = 0; i < sales.length; i++) {
            int total = 0;
            for(int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            System.out.println("Total sales on Day " + (i+1) + " = " + total);
        }

    }
}
