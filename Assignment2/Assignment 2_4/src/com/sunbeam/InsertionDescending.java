package com.sunbeam;
 
import java.util.Arrays;


public class InsertionDescending
{
	
		
		    public static void insertionSortDescending(int arr[]) {
		        int N = arr.length;
		        for (int i = 1; i < N; i++) {
		            int temp = arr[i];
		            int j = i - 1;

		            while (j >= 0 && arr[j] < temp) {
		                arr[j + 1] = arr[j];
		                j--;
		            }
		            arr[j + 1] = temp;
		        }
		    }

		    public static void main(String[] args) {
		        int arr[] = {24, 48, 12, 36, 72, 60};

		        System.out.println("Array before sort: " + Arrays.toString(arr));

		        insertionSortDescending(arr);

		        System.out.println("Array after sorting in descending order: " + Arrays.toString(arr));
		    }
		}




