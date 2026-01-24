package com.automationhub.java.abstraction;

// Abstract class
abstract class Payment {
    // Abstract method to be implemented by subclasses
    abstract void pay(double amount);

    // Concrete method (optional utility)
    void paymentMessage() {
        System.out.println("Processing your payment...");
    }
}

// Subclass 1: Credit Card Payment
class CreditCard extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card.");
    }
}

// Subclass 2: UPI Payment
class UPI extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

// Subclass 3: Net Banking
class NetBanking extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Net Banking.");
    }
}

// Main class
public class PaymentSystem {
    public static void main(String[] args) {
        // Payment through Credit Card
        Payment creditCard = new CreditCard();
        creditCard.paymentMessage();
        creditCard.pay(1500.00);

        System.out.println();

        // Payment through UPI
        Payment upi = new UPI();
        upi.paymentMessage();
        upi.pay(750.00);

        System.out.println();

        // Payment through Net Banking
        Payment netBanking = new NetBanking();
        netBanking.paymentMessage();
        netBanking.pay(10000.00);
    }
}
