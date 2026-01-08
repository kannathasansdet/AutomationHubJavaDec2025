package com.automationhub.java.constructor;

public class BankAccount {
    // Instance variables
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private double interestRate;

    // Most detailed constructor (will be called by others)
    public BankAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        System.out.println("Calling main constructor with all parameters");
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Constructor with default interest rate (chains to main constructor)
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this(accountNumber, accountHolder, balance, 0.05); // Default interest 5%
        System.out.println("Called from constructor with 3 parameters");
    }

    // Constructor with just account number and name (chains to 3-param constructor)
    public BankAccount(String accountNumber, String accountHolder) {
        this(accountNumber, accountHolder, 0.0); // Default balance 0
        System.out.println("Called from constructor with 2 parameters");
    }

    // Default constructor (chains to 2-param constructor)
    public BankAccount() {
        this("00000000", "Unknown"); // Default account number and holder
        System.out.println("Called from default constructor");
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }

    public static void main(String[] args) {
        System.out.println("Creating account1 with all parameters:");
        BankAccount account1 = new BankAccount("12345678", "John Doe", 1000.0, 0.03);
        account1.displayAccountDetails();

        System.out.println("\nCreating account2 with default interest:");
        BankAccount account2 = new BankAccount("87654321", "Jane Smith", 500.0);
        account2.displayAccountDetails();

        System.out.println("\nCreating account3 with default balance and interest:");
        BankAccount account3 = new BankAccount("11223344", "Alice Johnson");
        account3.displayAccountDetails();

        System.out.println("\nCreating account4 with all defaults:");
        BankAccount account4 = new BankAccount();
        account4.displayAccountDetails();
    }
}