package com.automationhub.java.constructor;

class Parents {
    int x = 10;

    public int sub (int a,int b){
        int c = a-b;
        System.out.println(c);
        return c;
    }

}

class Childs extends Parents {
    int x = 20;

    void display() {
        System.out.println(x);        // Child variable
        System.out.println(super.x);// Parent variable
        super.sub(90,20);
    }

    public int add (int a,int b){
        int c = a+b;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        Childs c = new Childs();
        c.display();
        c.add(10,20);
    }
}

/* Call parent class method using super
class Parent {
    void show() {
        System.out.println("Parent show method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child show method");
    }

    void display() {
        super.show(); // calls parent method
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
*/

/*
Default super() (Implicit)

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new Child();
    }
}
*/

/*
Explicit super() with parameters

class Parent {
    Parent(int x) {
        System.out.println("Parent constructor: " + x);
    }
}

class Child extends Parent {
    Child() {
        super(100);  // calls parent parameterized constructor
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new Child();
    }
}
*/
