package com.automationhub.java.array;

public class TwoDimensionalMovieTheatreSeatDemo {
    public static void main(String[] args) {

        int[][] seats = {
                {1, 1, 0},
                {0, 1, 1},
                {1, 0, 1}
        };

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 1) {
                    System.out.println("Row " + i + " Seat " + j + " : Available");
                } else {
                    System.out.println("Row " + i + " Seat " + j + " : Booked");
                }
            }
        }
    }
}
