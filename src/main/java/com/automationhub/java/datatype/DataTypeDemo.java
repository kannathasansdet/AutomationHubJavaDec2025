package com.automationhub.java.datatype;

public class DataTypeDemo {

        public static void main(String[] args) {

            // Primitive types
            boolean isMarried = true;
            char grade = 'A';

            int rollNum = 78;
            byte age = 127;
            short rank = 1;
            long phone = 9876543210L;

            float productPrice = 499.99F;
            double bankBalance = 150000.80;

            // Non-Primitive types
            String name = "Rahul Kumar";
            int[] marks = {85, 90, 95};


            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Phone: " + phone);
            System.out.println("Product Price: " + productPrice);
            System.out.println("Bank Balance: " + bankBalance);
            System.out.println("Married: " + isMarried);
            System.out.println("Grade: " + grade);
            System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        }
    }

