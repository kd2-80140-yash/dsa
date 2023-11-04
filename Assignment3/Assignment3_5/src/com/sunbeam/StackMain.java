package com.sunbeam;

import java.util.*;

public class StackMain 
{
	public static void main(String[] args) {
		int arr[] = {25,20,15,10,5};
		Stack stk = new Stack(5);
		
		System.out.println("Array before reversing : " + Arrays.toString(arr));
		
		for(int ele : arr)
			stk.push(ele);
		
		for(int i = 0 ; i < arr.length ; i++)
			arr[i] = stk.pop();
		
		
		System.out.println();
		System.out.println("Array after reversing : " + Arrays.toString(arr));
	}
}
