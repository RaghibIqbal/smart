package com.Logicjavap.java;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

      int x;
      	Scanner sc=new Scanner(System.in);
      	System.out.println("Enter any Number:");
      	x=sc.nextInt();
      	if(x%2==0)
      	{
      		System.out.println("the number is even");
      	}
      	else
      	{
      		System.out.println("the number odd:");
      	}

	}

}
