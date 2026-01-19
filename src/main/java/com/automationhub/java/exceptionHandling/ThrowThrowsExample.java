package com.automationhub.java.exceptionHandling;

class Bank {

    void withdraw(int amount) throws Exception {

        if (amount < 0) {
            throw new Exception("Invalid Amount");
        }
        System.out.println("Withdrawing: " + amount);
    }
}

public class ThrowThrowsExample {
    public static void main(String[] args) {

        Bank bank = new Bank();

        try {
            bank.withdraw(-90);
        } catch (Exception e) {
            System.out.println("Exit");
        }

    }
    }
