package com.automationhub.java.StringConcepts;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class demonstrates several modern String methods introduced in Java 9+.
 */
public class ModernStringMethodsExample {

    public static void main(String[] args) {

        demonstrateContentEquals(); // Java 1.5+, but often good to show comparison
        demonstrateStartsWithOffset(); // Java 11
        demonstrateRepeat(); // Java 11
        demonstrateStripMethods(); // Java 11
        demonstrateIndent(); // Java 15
        demonstrateTranslateEscapes(); // Java 15

        // Methods that don't exist in java.lang.String as requested
        System.out.println("--- Addressing Non-existent String Methods ---");
        System.out.println("Note: The standard java.lang.String class does NOT have methods named:");
        System.out.println(" - replaceLast(String regex, String replacement)");
        System.out.println(" - replaceMatches(String regex, String replacement)");
        System.out.println(" - translate(Map<Character, Character> replacementMap)");
        System.out.println();

        // Show how to achieve 'replace last' using standard Java regex
        String regexExample = "one two three two one";
        demonstrateReplaceLastUsingMatcher(regexExample, "two", "LAST_TWO"); // Simulating replaceLast

        // Explain replaceAll (replaces ALL regex matches)
        System.out.println("--- Standard regex replacement: replaceAll ---");
        System.out.println("String.replaceAll(regex, replacement) replaces ALL matches.");
        String replacedAll = regexExample.replaceAll("two", "ALL_TWO");
        System.out.println("Original:   \"" + regexExample + "\"");
        System.out.println("After replaceAll(\"two\", \"ALL_TWO\"): \"" + replacedAll + "\"");
        System.out.println();
    }

    /**
     * Demonstrates contentEquals(CharSequence). Existed before Java 11, but useful.
     */
    public static void demonstrateContentEquals() {
        System.out.println("--- contentEquals(CharSequence) ---");
        String str1 = "Hello";
        StringBuffer sb = new StringBuffer("Hello");
        String str2 = "World";
        String str3 = "hello"; // Different case

        System.out.println("String 1: \"" + str1 + "\"");
        System.out.println("StringBuffer: \"" + sb + "\"");
        System.out.println("String 2: \"" + str2 + "\"");
        System.out.println("String 3: \"" + str3 + "\"");


        // Compare String with StringBuffer
        boolean contentEqualsSB = str1.contentEquals(sb);
        System.out.println("str1.contentEquals(sb): " + contentEqualsSB); // Output: true

        // Compare String with another String (can use contentEquals or equals)
        boolean contentEqualsStr2 = str1.contentEquals(str2);
        System.out.println("str1.contentEquals(str2): " + contentEqualsStr2); // Output: false

        boolean contentEqualsStr3 = str1.contentEquals(str3); // Case-sensitive
        System.out.println("str1.contentEquals(str3): " + contentEqualsStr3); // Output: false (different case)


        // For comparison with another String, .equals() is usually preferred and potentially slightly more performant
        // boolean equalsStr = str1.equals(str2);
        // System.out.println("str1.equals(str2): " + equalsStr); // Output: false

        System.out.println();
    }

    /**
     * Demonstrates startsWith(String prefix, int toffset) (Java 11).
     */
    public static void demonstrateStartsWithOffset() {
        System.out.println("--- startsWith(String prefix, int toffset) (Java 11) ---");
        String sentence = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Original String: \"" + sentence + "\"");

        // Check if the string starts with "The"
        boolean startsThe = sentence.startsWith("The");
        System.out.println("Does string start with \"The\"? " + startsThe); // Output: true

        // Check if the string starts with "quick" starting from index 4
        // The substring from index 4 is "quick brown fox jumps over the lazy dog."
        boolean startsQuickAtOffset = sentence.startsWith("quick", 4);
        System.out.println("Does string start with \"quick\" from index 4? " + startsQuickAtOffset); // Output: true

        // Check if the string starts with "fox" starting from index 16
        // The substring from index 16 is "fox jumps over the lazy dog."
        boolean startsFoxAtOffset = sentence.startsWith("fox", 16);
        System.out.println("Does string start with \"fox\" from index 16? " + startsFoxAtOffset); // Output: true

        // Check a non-match
        boolean startsDogAtOffset = sentence.startsWith("dog", 30); // "lazy dog." starts at 31
        System.out.println("Does string start with \"dog\" from index 30? " + startsDogAtOffset); // Output: false

        boolean startsDogAtCorrectOffset = sentence.startsWith("dog", 31);
        System.out.println("Does string start with \"dog\" from index 31? " + startsDogAtCorrectOffset); // Output: true


        System.out.println();
    }

    /**
     * Demonstrates repeat(int count) (Java 11).
     */
    public static void demonstrateRepeat() {
        System.out.println("--- repeat(int count) (Java 11) ---");
        String word = "Java";
        String separator = "-";

        String repeatedWord = word.repeat(3);
        System.out.println("'" + word + "' repeated 3 times: \"" + repeatedWord + "\""); // Output: "JavaJavaJava"

        String repeatedSeparator = separator.repeat(20);
        System.out.println("'" + separator + "' repeated 20 times: \"" + repeatedSeparator + "\""); // Output: "--------------------"

        String emptyRepeat = word.repeat(0);
        System.out.println("'" + word + "' repeated 0 times: \"" + emptyRepeat + "\""); // Output: ""

        System.out.println();
    }

    /**
     * Demonstrates strip(), stripLeading(), stripTrailing() (Java 11).
     */
    public static void demonstrateStripMethods() {
        System.out.println("--- strip(), stripLeading(), stripTrailing() (Java 11) ---");
        // Contains space (\u0020), tab (\t), and EM SPACE (\u2003 - a common Unicode whitespace)
        String messyString = "\u2003 \t Hello World \u2003 \n";

        System.out.println("Original String:          '" + messyString + "'"); // Using single quotes to show boundaries

        // strip() removes all leading/trailing Unicode whitespace (uses Character.isWhitespace())
        String stripped = messyString.strip();
        System.out.println("After strip():            '" + stripped + "'"); // Output: "Hello World"

        // stripLeading() removes leading Unicode whitespace
        String leadingStripped = messyString.stripLeading();
        System.out.println("After stripLeading():     '" + leadingStripped + "'"); // Output: "Hello World \u2003 \n" (trailing whitespace remains)

        // stripTrailing() removes trailing Unicode whitespace
        String trailingStripped = messyString.stripTrailing();
        System.out.println("After stripTrailing():    '" + trailingStripped + "'"); // Output: "\u2003 \t Hello World" (leading whitespace remains)

        // Compare with older trim() which only removes <= U+0020 whitespace
        String trimmed = messyString.trim();
        System.out.println("After trim():             '" + trimmed + "'"); // Output: "\u2003 \t Hello World \u2003" (EM SPACE might not be removed by trim)
        // Note: trim specifically removes codepoints <= U+0020. strip uses Character.isWhitespace() which is more comprehensive.

        System.out.println();
    }

    /**
     * Demonstrates indent(int n) (Java 15).
     */
    public static void demonstrateIndent() {
        System.out.println("--- indent(int n) (Java 15) ---");
        String multiLineText = "First line.\nSecond line.\nThird line with a newline at the end\n";
        String singleLineText = "A single line";

        System.out.println("Original Multi-line Text:\n" + multiLineText);

        // Add 4 spaces of indentation
        String indentedText = multiLineText.indent(4);
        System.out.println("\nText after indent(4):\n" + indentedText);
        // Output will show 4 spaces at the start of each line, plus the original trailing newline.

        // Indent a single line - adds prefix and a trailing newline if one isn't present
        String indentedSingleLine = singleLineText.indent(2);
        System.out.println("\nOriginal Single Line: \"" + singleLineText + "\"");
        System.out.println("After indent(2):    \"" + indentedSingleLine + "\"");
        System.out.println("(Note the trailing newline added)");


        System.out.println();
    }

    /**
     * Demonstrates translateEscapes() (Java 15).
     * (Likely what was intended by 'translate()' in Java 16).
     */
    public static void demonstrateTranslateEscapes() {
        System.out.println("--- translateEscapes() (Java 15) ---");
        String stringWithLiteralEscapes = "Line one\\nLine two with a tab\\tAnd a carriage return\\r.";
        System.out.println("Original String with literal escapes:\n" + stringWithLiteralEscapes);

        String translatedString = stringWithLiteralEscapes.translateEscapes();
        System.out.println("\nString after translateEscapes():");
        System.out.println(translatedString);
        // Output will show:
        // Line one
        // Line two with a tab	And a carriage return
        // .

        System.out.println();
    }

    /**
     * Demonstrates how to replace the *last* occurrence of a regex match
     * using the standard Pattern and Matcher classes. This is not a single String method.
     * @param original The string to search within.
     * @param regex The regex pattern to find.
     * @param replacement The string to replace the last match with.
     */
    public static void demonstrateReplaceLastUsingMatcher(String original, String regex, String replacement) {
        System.out.println("--- Simulating 'Replace Last' using Matcher ---");
        System.out.println("Original String:    \"" + original + "\"");
        System.out.println("Regex to find:      \"" + regex + "\"");
        System.out.println("Replacement:        \"" + replacement + "\"");

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(original);

        int lastMatchStart = -1;
        int lastMatchEnd = -1;

        // Iterate through all matches to find the last one's start and end indices
        while (matcher.find()) {
            lastMatchStart = matcher.start();
            lastMatchEnd = matcher.end();
        }

        String result = original;
        if (lastMatchStart != -1) {
            // Reconstruct the string: part before the last match + replacement + part after the last match
            result = original.substring(0, lastMatchStart) + replacement + original.substring(lastMatchEnd);
        } else {
            System.out.println("(Regex not found in the string)");
        }


        System.out.println("After replacing last: \"" + result + "\"");
        System.out.println();
    }
}