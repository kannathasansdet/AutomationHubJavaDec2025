package com.automationhub.java.listcollection;


import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Create Stack
        Stack<String> stack = new Stack<>();

        // 1. push(E e)
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("After push(): " + stack);

        // 2. peek()
        System.out.println("Top element: " + stack.peek());

        // 3. pop()
        System.out.println("Popped element: " + stack.pop());
        System.out.println("After pop(): " + stack);

        // 4. search(Object o)
        System.out.println("Position of A (from top): " + stack.search("A"));

        // 5. isEmpty()
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Using as Vector methods
        stack.add("D");
        System.out.println("After add(): " + stack);
    }
}
