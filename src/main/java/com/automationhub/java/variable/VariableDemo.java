package com.automationhub.java.variable;

public class VariableDemo {

    //Global or instance variable

    int age = 25;
    String name = "Kannathasan";

    //Static variable

    static String schoolName = "TVK";

    public void Addition(){
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {

        VariableDemo variableDemo = new VariableDemo();
        variableDemo.Addition();
        System.out.println(variableDemo.name);
        System.out.println(variableDemo.age);
        System.out.println(VariableDemo.schoolName);

    }
}
