package com.automationhub.java.array;

public class MultiArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };

        System.out.println(arr[1][0]);


        for (int i = 0; i < arr.length; i++) {          // rows
            for (int j = 0; j < arr[i].length; j++) {   // columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
