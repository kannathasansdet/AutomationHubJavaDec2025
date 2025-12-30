package com.automationhub.java.array;

public class StringArrayExample {
    public static void main(String[] args)
    {
// Creating a String array object.
        String[] city = new String[5];

// Initializing array with name of cities.
        city[0] = "Dhanbad";
        city[1] = "Mumbai";
        city[2] = "Ranchi";
        city[3] = "Kolkata";
        city[4] = "New York";

        for(String c : city){
            System.out.println(c);
        }
        for (int i = 0;i<city.length;i++){
            System.out.println(city[i]);
        }

// Displaying name of cities based on index value.
        System.out.println("City at 0 position: " +city[0]);
        System.out.println("City at 1 position: " +city[1]);
        System.out.println("City at 2 position: " +city[2]);
        System.out.println("City at 3 position: " +city[3]);
        System.out.println("City at 4 position: " +city[4]);


    }
}
