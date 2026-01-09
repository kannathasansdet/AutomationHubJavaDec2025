package com.automationhub.java.interfaceDemo;

public class SBI implements RBI{
    @Override
    public void savings() {
        System.out.println("Savings method");
    }

    @Override
    public void creditCard() {
        System.out.println("Credit Card method");

    }

    @Override
    public void debitCard() {
        System.out.println("Debit Card method");

    }

    public void loanProcess(){

        System.out.println("Loan Process");
    }

    public static void main(String[] args) {

        RBI rbi = new SBI();

        rbi.creditCard();
        rbi.savings();
        rbi.debitCard();

        SBI sbi = new SBI();
        sbi.creditCard();
        sbi.debitCard();
        sbi.savings();
        sbi.loanProcess();

        System.out.println();





    }

    @Override
    public void UsCountryTransaction() {

    }

    @Override
    public void IndiaCountryTransaction() {

    }
}
