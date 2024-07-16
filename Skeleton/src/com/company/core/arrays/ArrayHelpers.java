package com.company.core.arrays;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {

    /**
     * Adds element to the end of source
     *
     * @param source The source array
     * @param element The new element to add
     * @return A new array, the original array with element at the end
     *
     * @author Mihail Boychev
     */
    public static int[] add(int[] source, int element) {
        int[] newArray = new int[source.length + 1];

        for (int i = 0; i < source.length; i++){
            newArray[i] = source[i];
        }

        newArray[newArray.length - 1] = element;

        return newArray;
    }

    /**
     * Adds an element at the beginning of the source array (index 0)
     *
     * @param source array
     * @param element to be added at the beginning of the source array
     * @return A new resized array with the new element at index 0
     *
     * @author Simon Ankov
     */
    public static int[] addFirst(int[] source, int element) {
        int[] resizedArray = new int[source.length + 1];

        for (int i = 1; i < resizedArray.length; i++) {
            resizedArray[i] = source[i - 1];
        }

        resizedArray[0] = element;

        return resizedArray;
    }

    public static int[] addAll(int[] source, int... elements) {
        return new int[1];
    }

    /**
     * Checks if source contains element
     *
     * @param source The source array
     * @param element The element to check for
     * @return true if source contains element, otherwise, false
     *
     * @author Mihail Boychev
     */
    public static boolean contains(int[] source, int element) {
        for (int number : source) {
            if (number == element) {
                return true;
            }
        }

        return false;
    }

    /**
     * Copies count elements from sourceArray into destinationArray
     *
     * @param sourceArray The array to copy from
     * @param destinationArray The array to copy to
     * @param count The number of elements to copy
     *
     * @author Mihail Boychev
     */
    public static void copy(int[] sourceArray, int[] destinationArray, int count) {
        for (int i = 0; i < count; i++) {
            destinationArray[i] = sourceArray[i];
        }
    }

    /**
     * Copies elements from sourceArray, starting from sourceStartIndex
     * into destinationArray, starting from destStartIndex, taking count elements.
     *
     * @param sourceArray The array to copy from
     * @param sourceStartIndex The starting index in sourceArray
     * @param destinationArray The array to copy to
     * @param destStartIndex The starting index in destinationArray
     * @param count The number of elements to copy
     *
     * @return void
     *
     * @author Simon Ankov
     */

    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {

        for (int i = sourceStartIndex; i < count; i++) {

            destinationArray[destStartIndex] = sourceArray[i];

            destStartIndex += 1;
        }
    }

    public static void fill(int[] source, int element) {

    }

    /**
     * Finds the first index of target within source.
     *
     * @param source The array to check in
     * @param target The element to check for
     * @return The first index of target within source, otherwise, -1
     *
     * @author Mihail Boychev
     */
    public static int firstIndexOf(int[] source, int target) {
        for (int i = 0; i < source.length; i++) {
            if (target == source[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int[] insert(int[] source, int index, int element) {
        return new int[1];
    }

    /**
     * Checks if index is a valid index in source.
     *
     * @param source The array to check against
     * @param index The index to check for
     * @return If the index is inside the array
     *
     * @author Simon Ankov
     */
    public static boolean isValidIndex(int[] source, int index) {

        if (index >= 0 && index < source.length){
            return true;
        }

        return false;
    }

    /**
     * Finds the last index of target within source
     *
     * @param source The array to check in
     * @param target The index to check for
     * @return The last index of target within source, otherwise, -1
     *
     * @author Simon Ankov
     */
    public static int lastIndexOf(int[] source, int target) {

        for (int i = source.length - 1; i >= 0; i--) {
            if (source[i] == target){
                return i;
            }
        }

        return -1;
    }

    /**
     * Removes all occurrences of element within source
     *
     * @param source The array to remove from
     * @param element The element to check for
     *
     * @return A new array with all occurences of element removed
     *
     * @author Mihail Boychev
     */
    public static int[] removeAllOccurrences(int[] source, int element) {
        int occurrences = 0;
        for (int j : source) {
            if (j == element) {
                occurrences++;
            }
        }
        int[] newArray = new int[source.length - occurrences];
        int index = 0;

        for (int number: source) {
            if (number != element) {
                newArray[index++] = number;
            }
        }

        return newArray;
    }

    /**
     * Reverses arrayToReverse
     *
     * @param arrayToReverse The array to reverse
     * @return void
     *
     * @author Simon Ankov
     */
    public static void reverse(int[] arrayToReverse) {
        int[] reversedArray = new int[arrayToReverse.length];

        int indexToAddOn = 0;

        for (int i = arrayToReverse.length - 1; i >= 0; i--) {
            reversedArray[indexToAddOn] = arrayToReverse[i];
            indexToAddOn++;
        }
        arrayToReverse = reversedArray;
    }

    public static int[] section(int[] source, int startIndex, int endIndex) {
        return new int[1];
    }
}
