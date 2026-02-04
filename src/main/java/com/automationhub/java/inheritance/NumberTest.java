package com.automationhub.java.inheritance;

class Number
{
    int x = 20;
    void display()
    {
        System.out.println("X = " +x);
    }
}
class Number2 extends Number
{
    int x = 50;
    void display()
    {
        System.out.println("X = " +super.x); // Accessing superclass instance variable using super keyword.
        System.out.println("X = " +x);
    }
}
public class NumberTest {
    public static void main(String[] args)
    {
        Number2 n = new Number2();
        n.display();
    }
}