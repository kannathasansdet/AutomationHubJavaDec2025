package com.automationhub.java.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMethodsDemo {
    public static void main(String[] args) {

        try {
            // Step 1: Create File object
            File file = new File("C:\\Users\\priya\\IdeaProjects\\CoreJavaDecember2025\\src\\main\\resources\\demo.txt");

            // Step 2: Check if file exists
            if (file.exists()) {
                System.out.println("File already exists");
            } else {
                file.createNewFile();
                System.out.println("File created successfully");
            }

            // Step 3: Get file details
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Size (bytes): " + file.length());

            // Step 4: To write on the file

            FileWriter writer = new FileWriter("C:\\Users\\priya\\IdeaProjects\\CoreJavaDecember2025\\src\\main\\resources\\demo.txt");

            writer.write("Name: Kanna\n");
            writer.write("Course: Java\n");
            writer.close();

            // Step 5: Delete the file
            /*if (file.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Unable to delete file");
            }*/


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
