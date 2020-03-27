package dev.getgiddy.dsa.main;

import dev.getgiddy.dsa.sort.MergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(Arrays.toString(MergeSort.mergeSort(intArray, 0, intArray.length)));

    }

}
