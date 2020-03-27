package dev.getgiddy.dsa.sort;

import dev.getgiddy.dsa.base.Sort;

import static dev.getgiddy.dsa.util.Swap.swap;

public class BubbleSort extends Sort {

    @Override
    public int[] sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1 ; lastUnsortedIndex > 0 ;
             lastUnsortedIndex--){
            for (int i = 0 ; i < lastUnsortedIndex ; i++){
                if (array[i] > array[i+1]){
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

}
