package com.TRACXN.java;

import java.util.Arrays;
import java.util.Scanner;
public class CrossDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=sc.nextInt();
	int arr[][]=new int[n][n];
	System.out.println("enter row and col where u want to cross");
	int r=sc.nextInt();
	int c=sc.nextInt();
	arr[r-1][c-1]=1;
	int a,b;
	a=r-1;b=c-1;
	while(a<n&&b>=0)
	{
		arr[a][b]=1;
		a++;b--;
	}
	a=r-1;b=c-1;
	while(a<arr.length&&b<arr.length)
	{
		arr[a][b]=1;
		a++;b++;
	}
	a=r-1;b=c-1;
	while(a>=0&&b<arr.length)
	{
		arr[a][b]=1;
		a--;b++;
	}
	a=r-1;b=c-1;
	while(a>=0&&b>=0)
	{
		arr[a][b]=1;
		a--;b--;
	}
	for(int []k:arr)
	{
	System.out.println(Arrays.toString(k));
	}
	
}
}
