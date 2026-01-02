package com.automationhub.java.array;

public class TwoDimensionalSeatingDemo {

    public static void main(String[] args) {
        String[][] seats = {
                {"A", "B", "C", "D"},
                {"E", "F", "G", "H"},
                {"I", "J", "K", "L"}
        };
/*
        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }*/

        for (int i=0;i<seats.length;i++){
            for(int j=0;j< seats[i].length;j++){
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
