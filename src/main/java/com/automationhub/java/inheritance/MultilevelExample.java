package com.automationhub.java.inheritance;

// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Derived class from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Derived class from Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}

public class MultilevelExample {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();

        // Call methods from all three levels
        myPuppy.eat();   // from Animal
        myPuppy.bark();  // from Dog
        myPuppy.weep();  // from Puppy

        Dog Dog = new Dog();
        Dog.bark();
        Dog.eat();
    }

}
