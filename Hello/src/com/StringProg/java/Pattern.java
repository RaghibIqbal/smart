package com.StringProg.java;

public class Pattern {

	public static void main(String[] args) {
		int arr[]= {5,9,6,10,0,3,7,1,2,8,4};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+" === "+arr[i]);
		}
		System.out.println("___________________________________");
		
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int m=arr[i];
			arr1[m]=i;
			m=0;
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(i+" == "+arr1[i]);
		}
		
		
	}

}