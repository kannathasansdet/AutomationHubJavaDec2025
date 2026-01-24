package com.automationhub.java.abstraction;


abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    abstract void sleep();

    // Regular method
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {


    void makeSound() {
        System.out.println("Bark!");
    }

    @Override
    void sleep() {
        System.out.println("Sleep well");
    }

    void dance(){
        System.out.println("I will dance");
    }
}

class Cow extends Animal{

    @Override
    void makeSound() {

        System.out.println("Cow will sound like maaaaaaaaaaaa");
    }


    @Override
    void sleep() {

        System.out.println("I will sleep in garden");

    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();  // Output: Bark!
        d.eat();        // Output: Eating...
    }
}
