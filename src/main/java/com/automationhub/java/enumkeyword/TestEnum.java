package com.automationhub.java.enumkeyword;

public class TestEnum {

    public static void main(String[] args) {

        Day today = Day.MONDAY;

        if (today == Day.MONDAY) {
            System.out.println("Start of work week");
        }

        for (Day d : Day.values()){

            System.out.println(d);
        }

    }
}
