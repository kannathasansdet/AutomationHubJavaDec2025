package com.automationhub.java.exceptionHandling;

public class InsufficientBalanceException extends RuntimeException {

    InsufficientBalanceException(String message) {
        super(message);
    }
}
