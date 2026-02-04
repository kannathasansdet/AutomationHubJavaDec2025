package com.automationhub.java.inheritance;

// Superclass
class Animals {

    void run(){
        System.out.println("Animal will run fast");
    }

    void eat() {
        System.out.println("Animal eats food.");
    }

}
// Subclass 1
class Dogs extends Animals {
    void bark() {
        System.out.println("Dog barks.");
    }
}
// Subclass 2
class Cats extends Animals {
    void meow() {
        System.out.println("Cat meows.");
    }
}
// Subclass 3
class Cows extends Animals {
    void moo() {
        System.out.println("Cow moos.");
    }
}
public class HierarchicalExample {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.bark();
        dog.eat();
        dog.run();

        Cats cat = new Cats();
        cat.eat();
        cat.meow();
        cat.run();

        Cows cow = new Cows();
        cow.eat();
        cow.moo();
        cow.run();
    }
}

