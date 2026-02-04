package com.automationhub.java.array;


public class SumAnonymousArrayProblem {
    public static int sum(int[] arr) {
        int total = 0;
        for (int n : arr) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        int result = sum(new int[] {5, 10, 15});
        System.out.println("Sum: " + result);

        int result1 = sum(new int[] {15, 20, 15});
        System.out.println("Sum: " + result1);

        System.out.println(result-result1);
    }
}
