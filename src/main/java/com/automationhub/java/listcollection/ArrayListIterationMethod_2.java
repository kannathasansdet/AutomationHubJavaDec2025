package com.automationhub.java.listcollection;

import java.util.ArrayList;

public class ArrayListIterationMethod_2 {
    public static void main(String[] args) {

    ArrayList<Integer> marks = new ArrayList<Integer>();

        marks.add(90);
        marks.add(91);
        marks.add(92);
        marks.add(93);

    for (int i : marks) {
        System.out.println(i);
    }
}}
