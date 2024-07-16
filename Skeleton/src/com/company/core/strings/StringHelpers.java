package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {

    public static String abbreviate(String source, int maxLength) {
        return null;
    }

    /**
     *Capitalizes a string changing the first character to title case. No other characters are changed. If source is empty returns empty string.
     * @param source The string to modify
     * @return The capitalized string or empty string if source is empty
     *
     * @author Edis Ismailov
     */
    public static String capitalize(String source) {
        {
            if (source == null || source.isEmpty()) {
                return source;
            }
            return Character.toUpperCase(source.charAt(0)) + source.substring(1);
        }

    }

    /**
     *Concatenates string1 to the end of string2.
     * @param string1 The left part of the new string
     * @param string2 The right part of the new string
     * @return A string that represents the concatenation of string1 followed by string2's characters
     *
     * @author Edis Ismailov
     */
    public static String concat(String string1, String string2) {
     {
            if (string1 == null) {
                string1 = "";
            }
            if (string2 == null) {
                string2 = "";
            }

            return string1 + string2;
        }

    }

    public static boolean contains(String source, char symbol) {
        return false;
    }

    public static boolean endsWith(String source, char target) {
        return false;
    }

    public static int firstIndexOf(String source, char target) {
        return 0;
    }

    /**
     * Finds the last index of target within source.
     * @param source String - The string to check
     * @param symbol char - The character to check for
     * @return The last index symbol within source or -1 if no match
     *
     * @author Edis Ismailov
     */
    public static int lastIndexOf(String source, char symbol) {
        for (int i = source.length() - 1; i >= 0; i--) {
            if (source.charAt(i) == symbol) {
                return i;
            }
        }
        return -1;
    }

    public static String pad(String source, int length, char paddingSymbol) {
        return null;

    }

    public static String padEnd(String source, int length, char paddingSymbol) {
        return null;
    }

    /**
     * Pads source on the left side with paddingSymbol enough times to reach length length.
     * @param source String - The string to pad
     * @param length int - The length of the string to achieve
     * @param paddingSymbol char - The character used as padding
     * @return The padded string or null if source is null
     *
     * @author Edis Ismailov
     */
    public static String padStart(String source, int length, char paddingSymbol) {
        int padLength = length - source.length();
        if (padLength <= 0) {
            return source;
        }
        String format = "%" + length + "s";
        return String.format(format, source).replace(' ', paddingSymbol);
    }

    public static String repeat(String source, int times) {
        return null;
    }

    /**
     *Reverses source so that the first element becomes the last, the second element becomes the second to last, and so on.
     * @param source String - The string to reverse
     * @return The reversed string
     *
     * @author Edis Ismailov
     */
    public static String reverse(String source) {
        char[] chars = source.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);

    }

    public static String section(String source, int start, int end) {
        return null;
    }

    public static boolean startsWith(String source, char target) {
        return false;
    }

}
