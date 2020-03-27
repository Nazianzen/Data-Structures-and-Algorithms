package dev.getgiddy.dsa.sort;

public class MergeSort {
    
    public static int[] mergeSort(int[] array, int start, int end){
        
        if (end - start < 2) { return array; }
        
        int mid = (start + end) / 2;

        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        return merge(array, start, mid, end);

    }

    public static int[] merge(int[] array, int start, int mid, int end) {

        if (array[mid -1] <= array[mid]){ return array; }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);

        return array;
    }

}
