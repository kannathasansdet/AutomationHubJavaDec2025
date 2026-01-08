package com.automationhub.java.constructor;

public class Parent {
    int x = 10;

    void show(){
        System.out.println("It is Parent class method");
    }
    void coding(int line){

        System.out.println("The lines of code" +line);
    }
}

class Child extends Parent {
  int x = 20;

   void show() {
        super.coding(10);
        System.out.println(x);   // 20
       System.out.println(super.x);  // 10
    }

   public static void main(String[] args) {
       new Child().show();
    }
}

