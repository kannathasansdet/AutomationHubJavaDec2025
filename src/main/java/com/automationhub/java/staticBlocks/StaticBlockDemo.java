package com.automationhub.java.staticBlocks;

class StaticBlockDemo {

    StaticBlockDemo(){

        System.out.println("This is my no arg Constructor");
    }
    static {
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {

        StaticBlockDemo sc = new StaticBlockDemo();
        StaticBlockDemo sc1 = new StaticBlockDemo();
        StaticBlockDemo sc2 = new StaticBlockDemo();
        System.out.println("Main method executed");
    }
}
