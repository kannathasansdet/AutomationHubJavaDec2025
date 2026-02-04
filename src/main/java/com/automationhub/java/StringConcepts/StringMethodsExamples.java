package com.automationhub.java.StringConcepts;

import java.time.LocalDate;
import java.util.Locale;

/**
 * This class demonstrates various modern and classic String methods in Java.
 */
public class StringMethodsExamples {

    public static void main(String[] args) {
        demonstrateValueOf();
        demonstrateFormat();
        demonstrateIndent();
        demonstrateLines();
        demonstrateRepeat();
        demonstrateStripMethods();
        demonstrateTranslateEscapes(); // Corrected from translate(Map)
    }

    /**
     * Demonstrates String.valueOf(primitive)
     */
    public static void demonstrateValueOf() {
        System.out.println("--- String.valueOf(primitive) ---");
        int myInt = 123;
        double myDouble = 98.6;
        boolean myBoolean = false;
        char[] myChars = {'J', 'a', 'v', 'a'};

        String strFromInt = String.valueOf(myInt);
        String strFromDouble = String.valueOf(myDouble);
        String strFromBoolean = String.valueOf(myBoolean);
        String strFromCharArray = String.valueOf(myChars);

        System.out.println("int " + myInt + " as String: \"" + strFromInt + "\"");
        System.out.println("double " + myDouble + " as String: \"" + strFromDouble + "\"");
        System.out.println("boolean " + myBoolean + " as String: \"" + strFromBoolean + "\"");
        System.out.println("char[] " + new String(myChars) + " as String: \"" + strFromCharArray + "\"");
        System.out.println("Length of string from int: " + strFromInt.length());
        System.out.println();
    }

    /**
     * Demonstrates String.format(Locale, String, Object...)
     */
    public static void demonstrateFormat() {
        System.out.println("--- String.format(Locale, String, Object...) ---");
        String name = "Alice";
        int quantity = 5;
        double price = 19.99;
        LocalDate orderDate = LocalDate.now();

        // Format for US Locale
        String usFormatted = String.format(Locale.US,
                "Hello %s, your order of %d items costs a total of $%,.2f. Order placed on %tA.",
                name, quantity, price, orderDate);

        // Format for German Locale
        String germanFormatted = String.format(Locale.GERMANY,
                "Hallo %s, Ihre Bestellung von %d Artikeln kostet insgesamt %,.2f €. Bestellung aufgegeben am %tA.",
                name, quantity, price, orderDate);

        System.out.println("US Locale: " + usFormatted);
        System.out.println("German Locale: " + germanFormatted);
        System.out.println("(Notice the difference in decimal separator ',' vs '.' and the day name language)");
        System.out.println();
    }

    /**
     * Demonstrates indent(int) (Java 15+)
     */
    public static void demonstrateIndent() {
        System.out.println("--- indent(int n) ---");
        String multiLineText = "First line.\nSecond line.\nThird line.";

        System.out.println("Original Text:\n" + multiLineText);

        // Add 4 spaces of indentation
        String indentedText = multiLineText.indent(4);
        System.out.println("\nText after indent(4):\n" + indentedText);

        // A positive indent adds a trailing newline if the string doesn't have one
        String singleLine = "One line.".indent(2);
        System.out.println("Single line indented, showing trailing newline: [" + singleLine + "]");
        System.out.println();
    }

    /**
     * Demonstrates lines() (Java 9+)
     */
    public static void demonstrateLines() {
        System.out.println("--- lines() ---");
        String textWithLines = "Line 1\nLine 2\r\nLine 3\n\nLine 5";

        System.out.println("Original Text:\n" + textWithLines);
        System.out.println("\nProcessing with .lines() stream:");

        textWithLines.lines()
                .filter(line -> !line.isBlank()) // Filter out empty lines
                .map(line -> "-> " + line.toUpperCase()) // Transform each line
                .forEach(System.out::println);
        System.out.println();
    }

    /**
     * Demonstrates repeat(int) (Java 11+)
     */
    public static void demonstrateRepeat() {
        System.out.println("--- repeat(int count) ---");
        String pattern = "-=";

        String repeatedPattern = pattern.repeat(10);
        System.out.println("'" + pattern + "' repeated 10 times: " + repeatedPattern);

        String word = "Echo ";
        String repeatedWord = word.repeat(3);
        System.out.println("'" + word + "' repeated 3 times: " + repeatedWord);

        String emptyRepeat = word.repeat(0);
        System.out.println("'" + word + "' repeated 0 times: '" + emptyRepeat + "'");
        System.out.println();
    }

    /**
     * Demonstrates strip(), stripLeading(), and stripTrailing() (Java 11+)
     */
    public static void demonstrateStripMethods() {
        System.out.println("--- strip(), stripLeading(), stripTrailing() ---");
        // \u0020 is a standard space, \t is a tab. strip() handles all Unicode whitespace.
        String messyString = " \t  Hello World   \t ";

        System.out.println("Original String:          '"+ messyString + "'");
        
        // strip() removes both leading and trailing whitespace
        String stripped = messyString.strip();
        System.out.println("After strip():            '"+ stripped + "'");
        
        // stripLeading() removes only leading whitespace
        String leadingStripped = messyString.stripLeading();
        System.out.println("After stripLeading():     '"+ leadingStripped + "'");

        // stripTrailing() removes only trailing whitespace
        String trailingStripped = messyString.stripTrailing();
        System.out.println("After stripTrailing():    '"+ trailingStripped + "'");
        System.out.println("(Note: strip() is Unicode-aware, unlike the older trim() method)");
        System.out.println();
    }
    
    /**
     * Demonstrates translateEscapes() (Java 15+).
     * Note: The standard java.lang.String class does not have a `translate(Map)` method.
     * The method you might be thinking of is `translateEscapes()`, which was added in Java 15.
     * It translates escape sequences like \\n into their actual character values.
     */
    public static void demonstrateTranslateEscapes() {
        System.out.println("--- translateEscapes() ---");
        String stringWithEscapes = "First line\\nSecond line with a tab\\tAnd a carriage return\\r.";

        System.out.println("Original String with literal escapes:\n" + stringWithEscapes);

        String translatedString = stringWithEscapes.translateEscapes();

        System.out.println("\nString after translateEscapes():");
        System.out.println(translatedString);
        System.out.println();
    }


    /*Explanation of Each Section's Output

    String.valueOf(primitive)
    This shows how primitive types like int, double, and boolean are converted into their string representations. The result is a true String object, on which you can call methods like .length().
    format(Locale, String, Object...)
    This demonstrates the power of formatting a string for different regions. Notice how the US output uses . for the decimal and a comma for the thousands separator ($19.99), while the German output uses , for the decimal and . for the thousands separator (19,99 €). The day of the week is also translated.
    indent(int n)
    You can see how indent(4) adds exactly four spaces to the beginning of each line of the string. This is very useful for formatting code or text blocks programmatically.
    lines()
    This method turns a multi-line string into a Stream<String>. The example then uses stream operations to filter out the blank line, convert the remaining lines to uppercase, and print them. This is a modern, functional way to process lines of text.
    repeat(int count)
    A simple but useful method. The example shows how to create a decorative line (-=-=-=...) and repeat a word multiple times.
    strip(), stripLeading(), stripTrailing()
    This clearly shows the difference between the three methods. strip() cleans up both ends of the string, while stripLeading() and stripTrailing() only clean up the beginning or the end, respectively. The single quotes in the output make it easy to see where the whitespace has been removed.
            translateEscapes()
    This section clarifies that translate(Map) isn't a standard method and provides an example for the likely intended method, translateEscapes(). The output shows how a string containing the literal characters \ and n (\\n) is converted into a string containing an actual newline character.*/
}