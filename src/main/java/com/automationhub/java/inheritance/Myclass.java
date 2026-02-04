package com.automationhub.java.inheritance;

// Create a base class or superclass.
class A
{
    // Declare an instance method.
    public void methodA()
    {
        System.out.println("Base class method");
    }
}
// Declare a derived class or subclass and extends class A.
class B extends A
{
    public void methodB()
    {
        System.out.println("Child class method");
    }
}
public class Myclass {

    public static void main(String[] args)
    {
        // Create an object of class B.
        B obj = new B();
        obj.methodA(); // methodA() of B will be called because by default, it is available in B.
        obj.methodB(); // methodB() of B will be called.
    }
}