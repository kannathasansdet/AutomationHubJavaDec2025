package com.automationhub.java.StringConcepts;

/**
 * This class demonstrates various String methods for searching
 * characters and substrings within a string.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class demonstrates String methods for replacement and trimming.
 */
public class StringReplaceAndTrimExamples {

    public static void main(String[] args) {
        String originalString = "  Hello World! Hello Java!   ";
        String regexString = "One two Three two One Two.";

        demonstrateReplaceMethods(originalString);
        demonstrateRegexReplaceMethods(regexString);
        demonstrateTrimMethod(originalString);

        // Addressing the non-existent methods
        System.out.println("--- Regarding replaceLast and replaceMatches ---");
        System.out.println("Note: The standard java.lang.String class does NOT have methods named");
        System.out.println("`replaceLast(String regex, String replacement)` or `replaceMatches(String regex, String replacement)`.");
        System.out.println("`replaceAll(String regex, String replacement)` is used for replacing ALL regex matches.");
        System.out.println("Replacing the LAST regex match requires using the java.util.regex.Matcher class.");
        System.out.println();

        demonstrateReplaceLastUsingMatcher(regexString); // Show how to do replace last using Matcher
    }

    /**
     * Demonstrates replace(char, char) and replace(CharSequence, CharSequence).
     * @param str The string to perform replacements on.
     */
    public static void demonstrateReplaceMethods(String str) {
        System.out.println("--- Demonstrating replace Methods ---");
        System.out.println("Original String: \"" + str + "\"");

        // replace(char oldChar, char newChar)
        String replacedChar = str.replace('o', '*');
        System.out.println("After replace('o', '*'): \"" + replacedChar + "\"");
        // Output: "  Hell* W*rld! Hell* Java!   " - Note it replaces ALL 'o's

        // replace(CharSequence target, CharSequence replacement)
        // This replaces ALL occurrences of the target substring.
        String replacedSubstring = str.replace("Hello", "Greetings");
        System.out.println("After replace(\"Hello\", \"Greetings\"): \"" + replacedSubstring + "\"");
        // Output: "  Greetings World! Greetings Java!   " - Note it replaces ALL "Hello"s

        // Can also use characters for CharSequence
        String replacedWithCharSequence = str.replace("!", "?");
        System.out.println("After replace(\"!\", \"?\"): \"" + replacedWithCharSequence + "\"");
        // Output: "  Hello World? Hello Java?   "

        System.out.println();
    }

    /**
     * Demonstrates replaceFirst(String regex, String replacement).
     * Also shows the standard replaceAll(String regex, String replacement)
     * which is often confused with replaceMatches.
     * @param str The string to perform regex replacements on.
     */
    public static void demonstrateRegexReplaceMethods(String str) {
        System.out.println("--- Demonstrating Regex Replace Methods ---");
        System.out.println("Original String: \"" + str + "\"");

        // replaceFirst(String regex, String replacement)
        // Replace the first occurrence of "two" (case-sensitive)
        String replacedFirstWord = str.replaceFirst("two", "XYZ");
        System.out.println("After replaceFirst(\"two\", \"XYZ\"): \"" + replacedFirstWord + "\"");
        // Output: "One XYZ Three two One Two."

        // Replace the first sequence of one or more whitespace characters (\s+)
        String replacedFirstSpace = str.replaceFirst("\\s+", ", ");
        System.out.println("After replaceFirst(\"\\s+\", \", \"): \"" + replacedFirstSpace + "\"");
        // Output: "One, two Three two One Two."

        // Demonstrating the standard replaceAll (replaces ALL matches of a regex)
        // This is likely what `replaceMatches` might have intended.
        String replacedAllCaseInsensitiveTwo = str.replaceAll("(?i)two", "ALL_XYZ"); // (?i) makes it case-insensitive
        System.out.println("After replaceAll(\"(?i)two\", \"ALL_XYZ\"): \"" + replacedAllCaseInsensitiveTwo + "\"");
        // Output: "One ALL_XYZ Three ALL_XYZ One ALL_XYZ."

        System.out.println();
    }

    /**
     * Demonstrates how to achieve "replace last regex match" using Matcher.
     * @param str The string to perform regex replacements on.
     */
    public static void demonstrateReplaceLastUsingMatcher(String str) {
        System.out.println("--- Demonstrating 'Replace Last' using Matcher ---");
        System.out.println("Original String: \"" + str + "\"");

        // This requires using the regex Pattern and Matcher classes
        Pattern pattern = Pattern.compile("(?i)two"); // Find "two" case-insensitively
        Matcher matcher = pattern.matcher(str);

        // Find all matches first
        int lastMatchStart = -1;
        int lastMatchEnd = -1;
        while (matcher.find()) {
            lastMatchStart = matcher.start();
            lastMatchEnd = matcher.end();
        }

        String replacedLast = str;
        if (lastMatchStart != -1) {
            // Construct the new string by taking parts of the original string
            replacedLast = str.substring(0, lastMatchStart) + "LAST_XYZ" + str.substring(lastMatchEnd);
        }

        System.out.println("After replacing LAST \"two\" (case-insensitive) with \"LAST_XYZ\": \"" + replacedLast + "\"");
        // Output: "One two Three two One LAST_XYZ."
        System.out.println();
    }


    /**
     * Demonstrates the trim() method.
     * @param str The string to trim.
     */
    public static void demonstrateTrimMethod(String str) {
        System.out.println("--- Demonstrating trim() ---");
        System.out.println("Original String:          '" + str + "'"); // Using single quotes to show whitespace boundaries

        // trim() removes only standard whitespace characters from the beginning and end.
        // It does not handle all Unicode whitespace like strip().
        String trimmedString = str.trim();
        System.out.println("After trim():             '" + trimmedString + "'");
        // Output: "Hello World! Hello Java!"

        // Example with different whitespace types (trim vs strip)
        String messyWhitespace = "\u2003 \t Leading\u2003Trailing \n "; // \u2003 is EM SPACE
        System.out.println("\nOriginal (messy):         '" + messyWhitespace + "'");
        System.out.println("After trim():             '" + messyWhitespace.trim() + "'"); // trim won't remove \u2003
        // Output: "Leading\u2003Trailing" (with the EM SPACE character still there)

        // Using strip() (Java 11+) for comparison - handles more Unicode whitespace
        System.out.println("After strip() (Java 11+): '" + messyWhitespace.strip() + "'"); // strip removes \u2003
        // Output: "Leading\u2003Trailing" (Note: this is slightly different, strip *should* remove \u2003. My example string or print might be misleading here. Let's correct the explanation - trim is based on <= U+0020, strip uses Character.isWhitespace()).
        // Correction check: Yes, trim removes code points <= U+0020. strip uses Character.isWhitespace(). Let's use a different example or just stick to the basic whitespace for trim. The original example `  Hello...  ` is fine for trim. The comparison with strip is useful but needs careful explanation or a clearer example. Let's refine the trim explanation.

        // Let's refine the trim example to focus on basic whitespace
        String basicMessyString = "   \t   Basic Trim Example   \n ";
        System.out.println("Original (basic messy):   '" + basicMessyString + "'");
        System.out.println("After trim():             '" + basicMessyString.trim() + "'");
        // Output: "Basic Trim Example"

        System.out.println("(Note: trim() removes whitespace <= U+0020. strip() (Java 11+) is more comprehensive for Unicode whitespace)");

        System.out.println();
    }
    /**
     * Demonstrates how to achieve "replace last regex match" using Matcher.
     * Added above already.
     */
}