package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {

    /**
     * Abbreviates a string using ellipses.
     *
     * @param source    The string to modify
     * @param maxLength Maximum length of the resulting string
     * @return The abbreviated String.
     * @author Simon Ankov
     */
    public static String abbreviate(String source, int maxLength) {
        if (maxLength >= source.length()) {
            return source;
        }

        String abbreviation = "";

        for (int i = 0; i < maxLength; i++) {
            abbreviation += source.charAt(i);
        }

        for (int i = abbreviation.length() - 1; i <= source.length(); i++) {
            abbreviation += ".";
        }
        return abbreviation;
    }

    public static String capitalize(String source) {
        return null;
    }

    public static String concat(String string1, String string2) {
        return null;
    }

    public static boolean contains(String source, char symbol) {
        return false;
    }

    /**
     * Checks if the string source ends with the given character.
     *
     * @param source The string to check
     * @param target The character to check for
     * @return true if the string ends with target, else false
     * @author Simon Ankov
     */
    public static boolean endsWith(String source, char target) {
        if (!source.isEmpty() && source.charAt(source.length() - 1) == target) {
            return true;
        }

        if (source.isEmpty() && target == Character.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public static int firstIndexOf(String source, char target) {
        return 0;
    }

    public static int lastIndexOf(String source, char symbol) {
        return 0;
    }

    /**
     * Pads string on the left and right sides if it's shorter than length.
     *
     * @param source        The string to pad
     * @param length        The length of the string to achieve
     * @param paddingSymbol The character used as padding
     * @return The padded string
     * @author Simon Ankov
     */
    public static String pad(String source, int length, char paddingSymbol) {
        if (length <= source.length()) {
            return source;
        }

        int paddings = (length - source.length()) / 2;
        String padding = "";
        for (int i = 0; i < paddings; i++) {
            padding += String.valueOf(paddingSymbol);
        }
        return padding + source + padding;
    }

    public static String padEnd(String source, int length, char paddingSymbol) {
        return null;
    }

    public static String padStart(String source, int length, char paddingSymbol) {
        return null;

    }

    public static String repeat(String source, int times) {
        return null;
    }

    public static String reverse(String source) {
        return null;
    }

    public static String section(String source, int start, int end) {
        return null;
    }

    /**
     * Checks if the string source starts with the given character.
     *
     * @param source The string to inspect
     * @param target The character to search for
     * @return true if string starts with target, otherwise false
     *
     * @author Simon Ankov
     */
    public static boolean startsWith(String source, char target) {
        if (source.isEmpty()){
            return false;
        }

        return source.charAt(0) == target;
    }

}
