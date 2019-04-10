package com.IBMTest.java;

import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

public class SwappingTwoArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int n=sc.nextInt();
		int arr1[]=new int[n],arr2[]=new int[n],temp[]=new int[n];
		System.out.println("Enter a element of an array1:");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter a element of an array2:");
		for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			temp[i]=arr1[i];
			arr1[i]=arr2[i];
			arr2[i]=temp[i];
		}
		System.out.println("After swapping arr1:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("After swapping arr2:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr2[i]+" ");
		}

	}

}
