package com.automationhub.java.fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFile {

    public static void main(String[] args) {

        try {
            Properties prop = new Properties();

            // Set values
            prop.setProperty("browser", "firefox");
            prop.setProperty("url", "https://testsite.com");
            prop.setProperty("timeout", "20");

            // Save to file
            FileOutputStream fos = new FileOutputStream("config.properties");
            prop.store(fos, "Updated Configuration");

            System.out.println("Properties file updated successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
