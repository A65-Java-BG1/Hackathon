package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {

    /**
     * Abbreviates a string using ellipses.
     *
     * @param source The string to modify
     * @param maxLength Maximum length of the resulting string
     * @return The abbreviated String.
     *
     * @author Simon Ankov
     */
    public static String abbreviate(String source, int maxLength) {
        if (maxLength >= source.length()){
            return source;
        }

        String abbreviation = "";

        for (int i = 0; i < maxLength; i++) {

        }

        return null;
    }

    public static String capitalize(String source) {
        return null;
    }

    public static String concat(String string1, String string2) {
        return null;
    }

    /**
     * Checks if source contains a symbol.
     *
     * @param source The string to check
     * @param symbol The character to check for
     * @return boolean - true if symbol is within source or false if not
     *
     * @author Mihail Boychev
     */
    public static boolean contains(String source, char symbol) {

        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == symbol) {
                return true;
            }
        }

        return false;
    }

    public static boolean endsWith(String source, char target) {
        return false;
    }

    /**
     * Finds the first index of target within source.
     *
     * @param source The string to check
     * @param target The character to check for
     * @return int - The first index of target within source, otherwise, -1
     *
     * @author Mihail Boychev
     */
    public static int firstIndexOf(String source, char target) {

        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target) {
                return i;
            }
        }

        return -1;
    }

    public static int lastIndexOf(String source, char symbol) {
        return 0;
    }

    public static String pad(String source, int length, char paddingSymbol) {
        return null;

    }

    /**
     * Pads source on the right side with paddingSymbol enough times to reach length.
     *
     * @param source The string to pad
     * @param length The length of the string to achieve
     * @param paddingSymbol The character used as padding
     * @return String - The padded string
     *
     * @author Mihail Boychev
     */
    public static String padEnd(String source, int length, char paddingSymbol) {
        int timesToPad = length - source.length();

        for (int i = 0; i < timesToPad; i++) {
            source += paddingSymbol;
        }

        return source;
    }

    public static String padStart(String source, int length, char paddingSymbol) {
        return null;

    }

    /**
     * Repeats the given string times.
     *
     * @param source The string to repeat
     * @param times The number of times to repeat the string
     * @return The repeated string
     *
     * @author Mihail Boychev
     */
    public static String repeat(String source, int times) {

        String newString = source;

        for (int i = 1; i < times; i++) {
            newString += source;
        }

        return newString;
    }

    public static String reverse(String source) {
        return null;
    }

    /**
     * Returns a new string, starting from start and ending at end.
     *
     * @param source The string to reverse
     * @param start The starting position in source (inclusive)
     * @param end The end position in source (inclusive)
     * @return String - A new string, formed by the characters in source, starting from start to end
     *
     * @author Mihail Boychev
     */
    public static String section(String source, int start, int end) {

        String newString = "";

        for (int i = start; i <= end; i++) {
            newString += source.charAt(i);
        }

        return newString;
    }

    public static boolean startsWith(String source, char target) {
        return false;
    }

}
