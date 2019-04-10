package com.IBMTest.java;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static int fibon(int i)
	{
		if(i==1||i==2)
		{
		
			return 1;
		}
		else
		{
		    return(fibon(i-1)+fibon(i-2));//
		}
			
		
	}

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enetr a limitation of Fibonacci:");
	    int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(fibon(i)+" ");
		}

	}

}
