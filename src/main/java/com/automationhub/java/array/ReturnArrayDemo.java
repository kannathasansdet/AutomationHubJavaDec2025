package com.automationhub.java.array;


import java.util.Arrays;

public class ReturnArrayDemo {

    public static void main(String[] args) {
        int[] result = getEvenNumbers();
        System.out.println(Arrays.toString(result));
    }

    public static int[] getEvenNumbers() {
        return new int[]{2, 4, 6, 8};
    }
}

/*
public static int[] squareElements(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        arr[i] = arr[i] * arr[i];
    }
    return arr;
}
*/

