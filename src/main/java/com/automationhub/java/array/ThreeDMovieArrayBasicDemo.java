package com.automationhub.java.array;

public class ThreeDMovieArrayBasicDemo {

    public static void main(String[] args) {

/*
        int[][][] seats = new int[3][2][3];

        //Morning Show (Index 0)
        seats[0][0][0] = 1;
        seats[0][0][1] = 0;
        seats[0][0][2] = 1;

        seats[0][1][0] = 1;
        seats[0][1][1] = 1;
        seats[0][1][2] = 0;

        //Evening Show (Index 2)
        seats[1][0][0] = 0;
        seats[1][0][1] = 1;
        seats[1][0][2] = 1;

        seats[1][1][0] = 1;
        seats[1][1][1] = 1;
        seats[1][1][2] = 1;

        //Evening Show (Index 2)
        seats[2][0][0] = 1;
        seats[2][0][1] = 0;
        seats[2][0][2] = 0;

        seats[2][1][0] = 1;
        seats[2][1][1] = 1;
        seats[2][1][2] = 1;
*/
        int[][][] seats = {
                {   // Morning Show
                        {1, 0, 1},
                        {1, 1, 0}
                },
                {   // Afternoon Show
                        {0, 1, 1},
                        {1, 1, 1}
                },
                {   // Evening Show
                        {1, 0, 0},
                        {1, 1, 1}
                }
        };

        for (int show = 0; show < seats.length; show++) {
            System.out.println("Show " + (show + 1));
            for (int row = 0; row < seats[show].length; row++) {
                for (int seat = 0; seat < seats[show][row].length; seat++) {
                    System.out.print(seats[show][row][seat] + " ");
                }
                System.out.println();
            }
            System.out.println("-----------");
        }
    }}