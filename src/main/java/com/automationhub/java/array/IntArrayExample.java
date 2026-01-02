package com.automationhub.java.array;


public class IntArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }

        System.out.println("Total = " + sum);
    }
}
