package com.automationhub.java.StringConcepts;

public class StringBufferBuilderDemo {

    public static void main(String[] args) {

        // ===============================
        // STRING BUFFER DEMO
        // ===============================
        System.out.println("---- StringBuffer Demo ----");

        StringBuffer sbuf = new StringBuffer("Java");

        // append()
        sbuf.append(" Programming");
        System.out.println("append(): " + sbuf);

        // insert()
        sbuf.insert(4, " Language");
        System.out.println("insert(): " + sbuf);

        // replace()
        sbuf.replace(5, 13, "World");
        System.out.println("replace(): " + sbuf);

        // delete()
        sbuf.delete(5, 10);
        System.out.println("delete(): " + sbuf);

        // deleteCharAt()
        sbuf.deleteCharAt(4);
        System.out.println("deleteCharAt(): " + sbuf);

        // reverse()
        sbuf.reverse();
        System.out.println("reverse(): " + sbuf);

        // capacity()
        System.out.println("capacity(): " + sbuf.capacity());

        // length()
        System.out.println("length(): " + sbuf.length());

        // charAt()
        System.out.println("charAt(2): " + sbuf.charAt(2));

        // substring()
        System.out.println("substring(): " + sbuf.substring(0, 4));

        // ===============================
        // STRING BUILDER DEMO
        // ===============================
        System.out.println("\n---- StringBuilder Demo ----");

        StringBuilder sb = new StringBuilder("Hello");

        // append()
        sb.append(" World");
        System.out.println("append(): " + sb);

        // insert()
        sb.insert(5, " Java");
        System.out.println("insert(): " + sb);

        // replace()
        sb.replace(6, 10, "Programming");
        System.out.println("replace(): " + sb);

        // delete()
        sb.delete(6, 18);
        System.out.println("delete(): " + sb);

        // deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt(): " + sb);

        // reverse()
        sb.reverse();
        System.out.println("reverse(): " + sb);

        // capacity()
        System.out.println("capacity(): " + sb.capacity());

        // ensureCapacity()
        sb.ensureCapacity(40);
        System.out.println("ensureCapacity(): " + sb.capacity());

        // length()
        System.out.println("length(): " + sb.length());

        // charAt()
        System.out.println("charAt(1): " + sb.charAt(1));

        // substring()
        System.out.println("substring(): " + sb.substring(0, 5));

        // ===============================
        // CONVERSION
        // ===============================
        String finalString = sb.toString();
        System.out.println("\nConverted to String: " + finalString);
    }
}
