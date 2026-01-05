package com.automationhub.java.array;

public class JaggedArrayDemo {
    public static void main(String[] args) {

        int[][] marks = new int[3][];

        // Each row has different length
        marks[0] = new int[]{85, 90, 88};
        marks[1] = new int[]{78, 82, 80, 75, 88};
        marks[2] = new int[]{92, 89};

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + " marks: ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
