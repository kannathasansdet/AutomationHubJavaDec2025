package com.automationhub.java.controlFlow;

public class ReturnKeywordDemo {

    public int addition(){
         int a = 10;
         int b = 20;
         int c = a+b;
         return c;

    }

    public String greeting(){

        return "Hello kannathasan";
    }
    public static void main(String[] args) {

        ReturnKeywordDemo ReturnKeywordDemo = new ReturnKeywordDemo();
        int d = ReturnKeywordDemo.addition()+60;
        System.out.println(d);

        System.out.println(ReturnKeywordDemo.greeting());
        String text = ReturnKeywordDemo.greeting();
        System.out.println(text.toUpperCase());
    }
}
