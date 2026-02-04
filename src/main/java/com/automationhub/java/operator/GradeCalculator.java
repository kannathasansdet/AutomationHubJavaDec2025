package com.automationhub.java.operator;


public class GradeCalculator {
    public static void main(String[] args) {

        int marks = 78;

        String grade = marks >= 90 ? "A" :
                marks >= 80 ? "B" :
                        marks >= 70 ? "C" :
                                marks >= 60 ? "D" : "F";

        System.out.println("Grade: " + grade); // Output: C
    }
}

/*
result = condition1 ? expression1
         : condition2 ? expression2
         : condition3 ? expression3
         : defaultExpression;*/
