package com.automationhub.java.enumkeyword;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

class OrderStatus {

    public static final String PLACED = "PLACED";
    public static final String SHIPPED = "SHIPPED";
    public static final String DELIVERED = "DELIVERED";
}
/*

Problems ❌

Typos allowed: "SHIPED"
No type safety
No grouping
Poor readability
No compiler checks*/
