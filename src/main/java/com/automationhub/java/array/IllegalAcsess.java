package com.automationhub.java.array;

public class IllegalAcsess {
    public static void main(String[] args)
    {
        int[] arr = new int[2];
        arr[0] = 30;
        arr[1] = 20;

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
