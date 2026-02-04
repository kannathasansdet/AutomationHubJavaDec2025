package com.automationhub.java.fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample.txt"); // File must exist
            int ch;
            while ((ch = fr.read()) != -1) { // read() returns int, -1 means EOF
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
