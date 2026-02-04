package com.automationhub.java.staticBlocks;

class MultipleStaticBlock {

    static {
        System.out.println("Static Block 1");
    }

    static {
        System.out.println("Static Block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}

//Static blocks execute top to bottom.
/*
✔ Executes only once
✔ Cannot use this or super
✔ Can access only static members

static variables
↓
static blocks
↓
main method
↓
constructor

*/
