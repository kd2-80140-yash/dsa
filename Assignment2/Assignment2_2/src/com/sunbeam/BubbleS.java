package com.sunbeam;

import java.util.Arrays;

public class BubbleS 
{
   public static int bubbleSort(int arr[],int N)
   {
	   int flag = 0;
	   int comparisons=0;
	
	   for(int i=1;i<N;i++)
	   {
		   flag = 0;
		   
		   
		  for(int j=0;j<N-1;j++)
		  {
			  comparisons++;
			  if(arr[j]>arr[j+1])
			  {
				  int temp=arr[i];
				  arr[j]= arr[j+1];
				  arr[j+1]= temp;
				  flag = 1;
			  }
			  
			  
		  }
		  if(flag==0)
			  break;
	   }
	   return comparisons;
	   
   }
   public static void main(String[] args) 
   {
	  int arr[] = {40,50,30,60,20,10};
	  
	  System.out.println("Arrays before sort"+Arrays.toString(arr));
	  int comparisons=bubbleSort(arr,arr.length);
	  
	  System.out.println("Arrays after sort"+Arrays.toString(arr));
	  
	  System.out.println("No of comparisons"+comparisons);
   }
  
}
