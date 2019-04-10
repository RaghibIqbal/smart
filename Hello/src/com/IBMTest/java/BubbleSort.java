package com.IBMTest.java;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array:-");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int temp;
		System.out.println("Enter value of an Array:-");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array Value After sorting:-");
		for(int a:arr)
		{
			System.out.println(a);
		}		

	}

}
