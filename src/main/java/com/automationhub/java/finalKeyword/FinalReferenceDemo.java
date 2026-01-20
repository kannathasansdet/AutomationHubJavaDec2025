package com.automationhub.java.finalKeyword;

public class FinalReferenceDemo {

    public static void main(String[] args) {

        final StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");   // ✔ allowed
        System.out.println(sb);

         //sb = new StringBuilder("Java"); // ❌ error
    }
}
