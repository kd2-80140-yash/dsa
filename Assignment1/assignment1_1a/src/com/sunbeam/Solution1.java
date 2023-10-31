package com.sunbeam;

import java.util.Scanner;

public class Solution1 
{
    public static int linearsearch(int arr[],int key)
    {
    	int count = 0;
    	
    	for(int i =0 ;i<arr.length;i++)
    	{
    		count++;
    		
    		if(arr[i]==key)
    		{
    			return count;
    		}
    	}
    	return count;
    }
    public static void main(String[] args)
    {
    	
    	Scanner sc = new Scanner(System.in);
    	
        int[] arr = {5,10,15,20,25,30,35};
       
        System.out.println("Enter the key");
        
        int key = sc.nextInt();
        
        
        int count = linearsearch(arr, key);

        if (count != arr.length) {
            System.out.println("Element " + key + " found with " + count + " comparisons.");
        } else {
            System.out.println("Element " + key + " not found with " + count + " comparisons.");
        }
    }
}
