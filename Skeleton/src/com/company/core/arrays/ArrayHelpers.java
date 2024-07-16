package com.company.core.arrays;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {

    public static int[] add(int[] source, int element) {
        return new int[1];
    }

    public static int[] addFirst(int[] source, int element) {
        return new int[1];
    }

    /**
     * Combines elements from a source array with additional elements and returns a new array
     * containing all elements.
     *
     * @param source the original array to which elements will be added
     * @param elements additional elements to add to the source array
     * @return a new array containing all elements from the source array followed by
     *         additional elements
     *
     * @author Edis Ismailov
     */

    public static int[] addAll(int[] source, int... elements) {
            int totalLength = source.length + elements.length;
            int[] result= new int[totalLength];
            System.arraycopy(source, 0, result, 0, source.length);
            System.arraycopy(elements, 0, result, source.length, elements.length);
        return result;
    }

    public static boolean contains(int[] source, int element) {
        return false;
    }

    public static void copy(int[] sourceArray, int[] destinationArray, int count) {

    }

    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {

    }

    /**
     * Fills all elements of the given array with the specified element.
     *
     * @param source  the array to be filled
     * @param element the element to fill the array with
     *
     * @author Edis Ismailov
     */
    public static void fill(int[] source, int element) {
        for (int i = 0; i < source.length; i++) {
            source[i] = element;
        }
    }

    public static int firstIndexOf(int[] source, int target) {
        return 0;
    }

    /**
     * Inserts element at index index in source.
     *
     * @param source  int[] - The array to insert in.
     * @param index  int - The index to insert at.
     * @param element int - The element to insert.
     * @return int[] - A new array with element in it.
     *
     * @author Edis Ismailov
     */
    public static int[] insert(int[] source, int index, int element) {

        int[] destination = new int[source.length + 1];
        for (int i = 0; i < index; i++) {
            destination[i] = source[i];
        }
        destination[index] = element;

        for (int i = index; i < source.length; i++) {
            destination[i + 1] = source[i];
        }

        return destination;
    }

    public static boolean isValidIndex(int[] source, int index) {
        return false;
    }

    public static int lastIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] removeAllOccurrences(int[] source, int element) {
        return new int[1];
    }

    public static void reverse(int[] arrayToReverse) {
    }
    /**

     Returns a new array, from source, starting from startIndex and until endIndex*
     @param source The array to create the new array from
     @param startIndex The starting index
     @param endIndex The end index
     @return  A new array starting from startIndex (inclusive) and until endIndex (inclusive).
     *
     @author Edis Ismailov
     */
    public static int[] section(int[] source, int startIndex, int endIndex) {

        int sectionLength = endIndex - startIndex + 1;

        int[] sectionArray = new int[sectionLength];

        for (int i = 0; i < sectionLength; i++) {
            sectionArray[i] = source[startIndex + i];
        }
        return sectionArray;
    }

}
