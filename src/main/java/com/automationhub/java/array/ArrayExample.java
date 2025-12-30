package com.automationhub.java.array;

public class ArrayExample {

    public static void main(String[] args) {

/*
Declaration
        dataType[] arrayName;
// or, less commonly, but valid:
        dataType arrayName[];
        */

/*
 Instantiation (Memory Allocation)

        arrayName = new dataType[arraySize];
*/


/*
Initialization (Assigning Values)

        arrayName[0] = value1;
        arrayName[1] = value2;
// ... and so on
*/

        /*int mark11 = 80;
        int mark12 = 75;
        int mark13 = 90;
          int mark14 = 91;
            int mark15 = 92;

            int mark21 = 80;
        int mark22 = 75;
        int mark23 = 90;
          int mark24 = 91;
            int mark25 = 92;

        int[] marks1 = {80, 75, 90,90,89};
        int[] marks2 = {80, 75, 90,90,89};


📌 One variable → multiple values
📌 Easy to manage, loop, and process
*/

        /*String s1 = "Kannathasan";
       int a =  s1.length();
        System.out.println(a);*/

       // int [] markLists = new int [5];

        int [] markList;

        //arrayName = new dataType[arraySize];

        markList = new int[5];

        markList[0] = 1;
        markList[1] = 11;
        markList[2] = 12;
        markList[3] = 13;
        markList[4] = 14;


        // Step 1: Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Step 2: Print the length of the array
        System.out.println("Length of array: " + numbers.length);

        // Step 3: Access individual elements
        System.out.println("First element: " + numbers[0]); // Index starts at 0
        System.out.println("Third element: " + numbers[2]);

        // Step 4: Modify an element
        numbers[1] = 25; // Change second element to 25
        System.out.println("Second element after update: " + numbers[1]);

        // Step 5: Loop through the array
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Step 6: Enhanced for loop (for-each)
        System.out.println("Using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}