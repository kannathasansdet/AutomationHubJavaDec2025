package com.automationhub.java.StringConcepts;

public class StringBufferExample {
    public static void main(String[] args) {

        String db = new String("Kanna");

        String fullName = db+"Thasan";
        StringBuffer sb1 = new StringBuffer("");

        System.out.println(sb1.capacity());

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println(sb.capacity());
        sb.append(" World");
        System.out.println(sb); // Hello World



        sb.insert(6, "Java ");
        System.out.println(sb); // Hello Java World

        sb.replace(6, 10, "Amazing");
        System.out.println(sb); // Hello Amazing World

        sb.delete(5, 12);
        System.out.println(sb); // HelloWorld

        sb.reverse();
        System.out.println(sb); // dlroWolleH
    }
}
