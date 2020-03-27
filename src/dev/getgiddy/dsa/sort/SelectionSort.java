package dev.getgiddy.dsa.sort;

import dev.getgiddy.dsa.base.Sort;
import dev.getgiddy.dsa.util.Swap;

public class SelectionSort extends Sort {

    @Override
    public int[] sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex--){
            int largest = 0;

            for (int i = 1 ; i <= lastUnsortedIndex ; i++){
                if (array[i] > array[largest]){
                    largest = i;
                }
            }

            Swap.swap(array, largest, lastUnsortedIndex);
        }
        return array;
    }

}
