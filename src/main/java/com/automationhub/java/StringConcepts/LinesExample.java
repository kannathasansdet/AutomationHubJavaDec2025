package com.automationhub.java.StringConcepts;

import java.util.stream.Stream;

public class LinesExample {
    public static void main(String[] args) {
        String str = "Java\nProgramming";
        Stream<String> lines = str.lines();
        lines.forEach(System.out::println);
    }
}


/*
Explanation: Returns a stream of lines extracted from the string, making it easy to process each line individually using stream operations*/
