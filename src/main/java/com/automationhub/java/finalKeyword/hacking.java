package com.automationhub.java.finalKeyword;

final class Security {

    public void secureData() {
        System.out.println("Security logic executed");
    }

}

public class hacking /*extends Security*/{

    public static void main(String[] args) {

        System.out.println("Hi guys");
    }
}

//class Hack extends Security { }  // ❌ error

/*
Security class cannot be inherited
        Used for critical classes*/
