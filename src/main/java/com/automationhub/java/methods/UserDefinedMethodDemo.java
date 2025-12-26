package com.automationhub.java.methods;

public class UserDefinedMethodDemo {

    public void greeting(){
        System.out.println("Hello Arun welcome to Java world");
    }

    public static void greetingJob(){
        System.out.println("Hello Arun welcome to Java world");
    }

    public static void greetingNew(String Name,int age){
        System.out.println("Hello" +Name+" welcome to Java world with" +age+"Good luck");
    }

    public int add(){

        int a = 10;
        int b = 20;
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {

        UserDefinedMethodDemo userDefinedMethodDemo = new UserDefinedMethodDemo();

        userDefinedMethodDemo.greeting();
        UserDefinedMethodDemo.greetingJob();
        greetingNew("kannathasan",16);
        greetingNew("sandhiya",22);
        int b7 = userDefinedMethodDemo.add();
        System.out.println(b7);

    }
}
