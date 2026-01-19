package com.automationhub.java.exceptionHandling;

public class WithoutExceptionHandling {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int  result = a / b;

        System.out.println("Program ends"); // It will not reach to this line of code bez of the above line has exception

    }
}


/*
public class ArrayWithoutEH {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); // invalid index

        System.out.println("End of program");
    }
}
*/
