package com.Logicjavap.java;

import java.util.Scanner;

public class SwaptwNumWithout {

	public static void main(String[] args) {

      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the numbers of a and b:");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("Before swap numbers are:"+a+"  "+b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("After swap numbers are:"+a+"  "+b);
      
	}

}
