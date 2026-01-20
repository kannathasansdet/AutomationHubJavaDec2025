package com.automationhub.java.finalKeyword;

class Parent {

    final void show() {
        System.out.println("Final method in Parent class");
    }
}

public class Child extends Parent {
    
    /* void show() {
         System.out.println("This method in Child Class");
     }*/

    public static void main(String[] args) {
        Parent c = new Parent();
        c.show();
    }
}
/*

Final method cannot be overridden
Ensures logic safety*/
