package com.automationhub.java.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExample {
    public static void main(String[] args) {

            File file = new File("arun.txt"); // file not present
        try {
            Scanner sc = new Scanner(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    }

