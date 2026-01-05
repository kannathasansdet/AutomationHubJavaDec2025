package com.automationhub.java.array;

public class AnonymousArrayExample {

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        printArray(new int[] {10, 20, 30, 40});
    }
}
