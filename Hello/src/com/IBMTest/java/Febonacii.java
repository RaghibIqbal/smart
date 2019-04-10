package com.IBMTest.java;

import java.util.Scanner;

public class Febonacii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int s=sc.nextInt();
		/*int arr[]=new int[s];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<arr.length;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(int a:arr)
		{
		System.out.print(a+" ");
		}*/
		
		
		
		int sum=0;
		int a=0,b=1;
		System.out.print("0 "+" 1 ");
		
		while(sum<s)
		{
			sum=a+b;
			
			if(sum>=s)
			{
				break;
			}
			System.out.print(" "+sum+" ");
			a=b;
			b=sum;
		}
		

	}
	

}
