package com.automationhub.java.polymorphism;

class Bank {
    int getInterestRate() {
        return 5;
    }
}

class SBI extends Bank {

    int getInterestRate() {
        return 7;
    }

}

public class TestOverriding {
    public static void main(String[] args) {

        Bank bank = new SBI();  // Upcasting
        System.out.println(bank.getInterestRate());

    }
}
