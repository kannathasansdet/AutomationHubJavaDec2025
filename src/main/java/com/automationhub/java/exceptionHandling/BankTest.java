package com.automationhub.java.exceptionHandling;

public class BankTest {

    static void withdraw(double balance, double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {
        withdraw(5000, 7000);  // Runtime exception
    }
}
