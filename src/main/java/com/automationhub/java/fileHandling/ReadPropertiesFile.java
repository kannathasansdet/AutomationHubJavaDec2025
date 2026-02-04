package com.automationhub.java.fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public static void main(String[] args) {

        try {
            // Step 1: File path
            FileInputStream fis = new FileInputStream("C:\\Users\\priya\\IdeaProjects\\CoreJavaDecember2025\\config.properties");

            // Step 2: Create Properties object
            Properties prop = new Properties();

            // Step 3: Load file
            prop.load(fis);

            // Step 4: Read values
            System.out.println("Browser: " + prop.getProperty("browser"));
            System.out.println("URL: " + prop.getProperty("url"));
            System.out.println("Username: " + prop.getProperty("username"));
            System.out.println("Timeout: " + prop.getProperty("timeout"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
