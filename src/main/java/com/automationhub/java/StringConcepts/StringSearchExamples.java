package com.automationhub.java.StringConcepts;


/**
 * This class demonstrates various String methods for searching
 * characters and substrings within a string.
 */
public class StringSearchExamples {

    public static void main(String[] args) {
        String myString = "This is a test string. This string has 'is' multiple times.";

        demonstrateIndexOf(myString);
        demonstrateLastIndexOf(myString);
        demonstrateContains(myString);
        demonstrateStartsAndEndsWith(myString);
    }

    /**
     * Demonstrates the various indexOf methods.
     * @param str The string to search within.
     */
    public static void demonstrateIndexOf(String str) {
        System.out.println("--- Demonstrating indexOf Methods ---");
        System.out.println("Original String: \"" + str + "\"");

        // indexOf(int ch)
        int indexS = str.indexOf('s');
        System.out.println("Index of first 's': " + indexS); // Output: 3 (index of 's' in "This")

        // indexOf(String str)
        int indexIs = str.indexOf("is");
        System.out.println("Index of first \"is\": " + indexIs); // Output: 2 (index of 'i' in "This")

        // indexOf(int ch, int fromIndex)
        // Find the next 's' after the first one (which is at index 3)
        int nextIndexS = str.indexOf('s', indexS + 1);
        System.out.println("Index of next 's' after index " + (indexS + 1) + ": " + nextIndexS); // Output: 6 (index of 's' in "is")

        // Find 's' starting from a later index
        int indexSFromLater = str.indexOf('s', 10); // Search for 's' starting from index 10 ("test string...")
        System.out.println("Index of first 's' starting from index 10: " + indexSFromLater); // Output: 11 (index of 's' in "string")

        // indexOf(String str, int fromIndex)
        // Find the next "is" after the first one (which starts at index 2)
        int nextIndexIs = str.indexOf("is", indexIs + 1);
        System.out.println("Index of next \"is\" after index " + (indexIs + 1) + ": " + nextIndexIs); // Output: 6 (index of 'i' in "is")

        // Find "is" starting from a later index
        int indexIsFromLater = str.indexOf("is", 20); // Search for "is" starting from index 20 ("...is' multiple times.")
        System.out.println("Index of first \"is\" starting from index 20: " + indexIsFromLater); // Output: 27 (index of 'i' in "is")

        // Searching for characters/substrings that are not present
        int indexQ = str.indexOf('q');
        System.out.println("Index of 'q' (not found): " + indexQ); // Output: -1

        int indexXYZ = str.indexOf("xyz");
        System.out.println("Index of \"xyz\" (not found): " + indexXYZ); // Output: -1

        System.out.println();
    }

    /**
     * Demonstrates the various lastIndexOf methods.
     * @param str The string to search within.
     */
    public static void demonstrateLastIndexOf(String str) {
        System.out.println("--- Demonstrating lastIndexOf Methods ---");
        System.out.println("Original String: \"" + str + "\"");

        // lastIndexOf(int ch)
        int lastIndexS = str.lastIndexOf('s');
        System.out.println("Index of last 's': " + lastIndexS); // Output: 41 (index of 's' in "times")

        // lastIndexOf(String str)
        int lastIndexIs = str.lastIndexOf("is");
        System.out.println("Index of last \"is\": " + lastIndexIs); // Output: 40 (index of 'i' in "times")

        // lastIndexOf(int ch, int fromIndex)
        // Find the last 's' searching backwards from an index *before* the last 's'.
        // Let's search backwards from index 35 (somewhere before "multiple times.")
        int lastIndexSBefore = str.lastIndexOf('s', 35);
        System.out.println("Index of last 's' searching backwards from index 35: " + lastIndexSBefore); // Output: 11 (index of 's' in "string")

        // lastIndexOf(String str, int fromIndex)
        // Find the last "is" searching backwards from an index *before* the last "is".
        // Let's search backwards from index 39 (just before the 'i' in "times.")
        int lastIndexIsBefore = str.lastIndexOf("is", 39);
        System.out.println("Index of last \"is\" searching backwards from index 39: " + lastIndexIsBefore); // Output: 6 (index of 'i' in "is" after "This ")

        // Searching for characters/substrings that are not present backwards
        int lastIndexQ = str.lastIndexOf('q', str.length());
        System.out.println("Index of last 'q' (not found): " + lastIndexQ); // Output: -1

        int lastIndexXYZ = str.lastIndexOf("xyz", str.length());
        System.out.println("Index of last \"xyz\" (not found): " + lastIndexXYZ); // Output: -1

        System.out.println();
    }

    /**
     * Demonstrates the contains method.
     * @param str The string to search within.
     */
    public static void demonstrateContains(String str) {
        System.out.println("--- Demonstrating contains(CharSequence s) ---");
        System.out.println("Original String: \"" + str + "\"");

        // Check for a substring that is present
        boolean containsTest = str.contains("test");
        System.out.println("Does string contain \"test\"? " + containsTest); // Output: true

        // Check for a substring that is present
        boolean containsMultiple = str.contains("multiple");
        System.out.println("Does string contain \"multiple\"? " + containsMultiple); // Output: true

        // Check for a substring that is not present
        boolean containsNope = str.contains("nope");
        System.out.println("Does string contain \"nope\"? " + containsNope); // Output: false

        // contains uses CharSequence, which String implements. Can check for single chars too.
        boolean containsDot = str.contains(".");
        System.out.println("Does string contain \".\"? " + containsDot); // Output: true

        System.out.println();
    }

    /**
     * Demonstrates the startsWith and endsWith methods.
     * @param str The string to check.
     */
    public static void demonstrateStartsAndEndsWith(String str) {
        System.out.println("--- Demonstrating startsWith and endsWith Methods ---");
        System.out.println("Original String: \"" + str + "\"");

        // startsWith(String prefix)
        boolean startsWithThis = str.startsWith("This");
        System.out.println("Does string start with \"This\"? " + startsWithThis); // Output: true

        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Does string start with \"Hello\"? " + startsWithHello); // Output: false

        boolean startsWithLowerCaseThis = str.startsWith("this"); // Case-sensitive
        System.out.println("Does string start with \"this\" (lowercase)? " + startsWithLowerCaseThis); // Output: false

        // startsWith(String prefix, int toffset) (Java 11+)
        // Check if the string starting from index 5 ("is a test...") starts with "is"
        boolean startsWithIsAtOffset = str.startsWith("is", 5);
        System.out.println("Does string start with \"is\" from index 5? " + startsWithIsAtOffset); // Output: true (The substring " is a test..." starts at index 5, and " is" starts with "is" at index 6, but startsWith(prefix, offset) checks if the prefix *matches* the characters *starting at* the offset index. Index 5 is the space, not the 'i'. Let's pick offset 6.)

        startsWithIsAtOffset = str.startsWith("is", 6); // Corrected: check starting from index 6 ("is a test...")
        System.out.println("Does string start with \"is\" from index 6? " + startsWithIsAtOffset); // Output: true

        // Check if the string starting from index 11 ("string. This...") starts with "string"
        boolean startsWithStringAtOffset = str.startsWith("string", 11);
        System.out.println("Does string start with \"string\" from index 11? " + startsWithStringAtOffset); // Output: true

        // endsWith(String suffix)
        boolean endsWithTimes = str.endsWith("times.");
        System.out.println("Does string end with \"times.\"? " + endsWithTimes); // Output: true

        boolean endsWithString = str.endsWith("string");
        System.out.println("Does string end with \"string\"? " + endsWithString); // Output: false

        boolean endsWithUpperCaseTimes = str.endsWith("TIMES."); // Case-sensitive
        System.out.println("Does string end with \"TIMES.\" (uppercase)? " + endsWithUpperCaseTimes); // Output: false

        System.out.println();
    }
}