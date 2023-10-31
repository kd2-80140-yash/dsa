package com.sunbeam;

import java.util.Arrays;

public class SelectionS 
{
   public static int SelectionSort(int arr[],int N)
   {
	   
	   int comparisons = 0;
	   //count no of passes
	   
	   for(int i=0;i<N-1;i++)
	   {
		   for(int j=i+1;j<N;j++)
		   {
			   comparisons++;
			   
			   if (arr[i]>arr[j])
			   {
				   int temp = arr[i];
				   arr[i]= arr[j];
				   arr[j]= temp;
			   }
		   }
	   }
	   return comparisons;
   }
   
   public static void main(String[] args) 
   {
	  int arr[] = {40,60,20,30,10,50};
	  
	  
	  System.out.println("Arrays befort sort :"+Arrays.toString(arr));
	  
	int comparisons =  SelectionSort(arr,arr.length);
	  
	  System.out.println("Arrays after sort"+Arrays.toString(arr));
	  
	  
	System.out.println("No of comparisons"+comparisons);
   }
}
