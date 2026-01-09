package com.automationhub.java.interfaceDemo;

// Class implementing the Interface
public class Circle implements Drawable {
    @Override
    public void draw() { // Must provide implementation
        System.out.println("Drawing a Circle.");
    }
}

// Another Class
class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }

    public static void main(String[] args) {
        Drawable shape = new Circle();
        shape.draw(); // Output: Drawing a Circle.
        Drawable.printInfo(); // Output: This is a drawable object.
    }
}
