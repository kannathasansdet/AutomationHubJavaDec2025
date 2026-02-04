package com.automationhub.java.controlFlow;

public class PatternEx {
    public static void main(String[] args)
    {
        int rows = 5;
// Applying nested for loops.
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
