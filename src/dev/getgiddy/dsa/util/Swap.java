package dev.getgiddy.dsa.util;

public class Swap {
/**
 * Swaps the positions of two elements in an integer array.
 * @param array : <code>int[]</code> - array to perform the manipulation on.
 * @param i : <code>int</code> - index of first element in the swap.
 * @param j : <code>int</code> - index of second element in the swap.
 */
    public static void swap(int[] array, int i, int j){

        // Check for equality of swap elements.
        // If they are equal then no swap is required.
        if (i == j) return;

        //Perform swap
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
