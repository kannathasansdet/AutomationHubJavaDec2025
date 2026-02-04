package com.automationhub.java.fileHandling;


import java.io.*;

public class BufferedFileCopyExample {
    public static void main(String[] args) {
        String inputFile = "sample.txt";
        String outputFile = "output.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Adds a line break after each line
            }
            System.out.println("File copied successfully to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
