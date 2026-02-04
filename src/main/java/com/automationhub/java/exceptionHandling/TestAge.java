package com.automationhub.java.exceptionHandling;

public class TestAge {

    static void validateAge(int age) throws InvalidAgesException {
        if (age < 18) {
            throw  new InvalidAgesException("Enter correct age");
        }
        System.out.println("Age is valid");
    }

    static void enterAmount(int amount) throws InvalidAmountException {
        if(amount<0){
            throw new InvalidAmountException("The entered Amount is incorrect");
        }
        System.out.println("The amount is more than zero");
    }

    public static void main(String[] args) {

            enterAmount(10);

        try {
            validateAge(80);
        } catch (InvalidAgesException e) {
            throw new RuntimeException(e);
        }


    }
}
