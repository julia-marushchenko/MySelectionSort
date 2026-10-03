/**
 * Java program to sort the array.
 */

package com.myarrays;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an array.
        int[] array = {1, 5, 7, 2, 9, 5, 4};

        // Sorting the array.
        for (int i = 0; i <= array.length - 1; i++) {

            // Helping variables.
            int minValue = array[i];
            int minIndex = i;

            // Iterating through the array from min index.
            for (int j = i + 1; j < array.length; j++) {

                if(array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;

                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }

        // Printing the sorted array.
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
    }
}
