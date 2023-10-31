package com.sunbeam;

import java.util.Arrays;

public class SortBySalary 
{
   public static void sort(Employee[] employee)
   {
	   int N = employee.length;
	   for(int i =1; i<N;i++)
	   {
		   Employee key =employee[i];
		   int j = i-1;
		   
		   while(j>0 &&  employee[j].getSalary() < key.getSalary())
		   {
			   employee[j+1 ] = employee[j];
			   j--;
		   }
		   employee[j+1] = key;
		   
	   }
   }
   
   public static void main(String[] args) 
   {
	   Employee[] employee = new Employee[5];
	   
	   employee[0] = new Employee(1,"Yash",80000);
	   employee[1]  = new Employee(2,"Ashish",70000);
	   employee[2] = new Employee(3,"Hrishikesh",50000);
	   employee[3] = new Employee(4,"Hacker",100000);
	   employee[4] = new Employee(5,"Harshal",40000);
	   
	   System.out.println("Arrays before sort"+Arrays.toString(employee));
	   
	   sort(employee);
	   
	   System.out.println("Arrays after sort"+Arrays.toString(employee));
	   
	   
   }
}
