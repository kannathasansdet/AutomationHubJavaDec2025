package com.automationhub.java.constructor;

class ThisKeywordDemo {

    int id;
    String name;

    ThisKeywordDemo(int id, String name) {
        this.id = id;       // instance variable
        this.name = name;   // instance variable
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        ThisKeywordDemo s1 = new ThisKeywordDemo(101, "Gayathri");
        s1.display();
    }
}

/*
id and name on the left → instance variables

id and name on the right → constructor parameters

this.id means → current object’s id*/

/*  Calling current class method using this
class Demo {
    void show() {
        System.out.println("Show method");
    }

    void display() {
        this.show(); // optional but valid
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}
*/

/*
Constructor chaining using this()

class Employee {

    Employee() {
        System.out.println("Default Constructor");
    }

    Employee(int id) {
        this();  // calls default constructor
        System.out.println("Employee ID: " + id);
    }

    public static void main(String[] args) {
        Employee e = new Employee(1001);
    }
}
*/

/*
class Product {

    Product() {
        this(500);
        System.out.println("No-arg constructor");
    }

    Product(int price) {
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        new Product();
    }
}
*/
