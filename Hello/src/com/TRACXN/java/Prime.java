package com.TRACXN.java;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of element you want to check");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println();
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			int c=a[i];
			checkPrime(c);
		}

	}

	private static void checkPrime(int b) {
	int count=0;
	for(int i=1;i<=b;i++)
	{
		if(b%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("1");
	}
	else
	{
		System.out.println("0");
	}
		}
		
	}


