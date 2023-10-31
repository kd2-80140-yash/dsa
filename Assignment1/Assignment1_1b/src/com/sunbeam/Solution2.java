package com.sunbeam;

import java.util.Scanner;

public class Solution2 {
	public static int binarySearch(int arr[],int size,int key)
       {
	        int left = 0,right = size-1,mid;
	        
	        int count = 0;
	        while(left<=right)
	        {
	        	count++;
	        	
	        	mid =(left+right)/2;
	        	
	        	if(key==arr[mid])
	        		return mid;
	        	else if(key<arr[mid])
	        		right = mid-1;
	        	else
	        		left = mid+1;
	        }
	        return count;
       }
	
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50,60,70,80,90};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		
		int key = sc.nextInt();
		
		int count = binarySearch(arr,arr.length,key);
		
		if(count != arr.length)
			System.out.println("Key found at "+key+"with"+count+"comparisons");
		else
			System.out.println("Key not found");
		
		sc.close();
	}
}
