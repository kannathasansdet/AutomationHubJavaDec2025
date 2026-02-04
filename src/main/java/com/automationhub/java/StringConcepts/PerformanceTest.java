package com.automationhub.java.StringConcepts;

public class PerformanceTest {

    public static void main(String[] args) {
        long startTime, endTime;

        StringBuffer sb1 = new StringBuffer("A");
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sb1.append("B");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer: " + (endTime - startTime) + " ns");

        StringBuilder sb2 = new StringBuilder("A");
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sb2.append("B");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder: " + (endTime - startTime) + " ns");
    }
}
