package com.sunbeam;



import java.util.Scanner;

public class ByEmpid 
{
	

	public static int linearSearch(Employee arr[],int key) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i].getEmpid() == key)
				return i;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee arr[] = new Employee[5];
		
		arr[0] = new Employee(1, "Yash", 50000);
		arr[1] = new Employee(2, "Ashish", 54000);
		arr[2] = new Employee(3, "Girish", 50500);
		arr[3] = new Employee(4, "Ajay", 60000);
		arr[4] = new Employee(5, "Kedar", 20000);

		System.out.print("Enter Empid to Search for employee : ");
		int key = scan.nextInt();
		
		int result = linearSearch(arr,key);
		
		if(result != -1) {
			System.out.println("The Employee is at index " + result);
			System.out.println(arr[result]);
		} else
			System.out.println("Key not Found!!");
		scan.close();
	}

	}


