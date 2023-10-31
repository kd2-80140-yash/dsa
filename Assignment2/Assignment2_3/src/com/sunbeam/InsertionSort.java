package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {
    public static int insertionSort(int arr[], int N) {
        int comparisons = 0;
        for (int i = 1; i < N; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;

                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        return comparisons;
    }

    public static void main(String[] args) {
        int arr[] = {24, 48, 12, 36, 72, 60};

        System.out.println("Array before sort: " + Arrays.toString(arr));

        int comparisons = insertionSort(arr, arr.length);

        System.out.println("Array after sort: " + Arrays.toString(arr));
        System.out.println("No of comparisons: " + comparisons);
    }
}
