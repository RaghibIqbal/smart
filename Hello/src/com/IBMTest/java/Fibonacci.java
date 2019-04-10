package com.IBMTest.java;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int temp=0;
		int temp2=1;
		int sum=0;
	while(sum<m)
	{
		sum= temp+temp2;
		temp=temp2;
		temp2=sum;
		if(sum>=n)
		{
			System.out.println(sum+" ");
		}
	}

	}

}
