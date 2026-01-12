package com.automationhub.java.inheritance;

public class InheritanceTest {
    public static void main(String[] args)
    {
        // Create an object of the derived class.
        DerivedClass d = new DerivedClass();

        // Call features() method from the derived class using object reference variable d.
        d.features(); // Call ownFeature() method using reference variable d.
        d.ownFeature();
    }
}
