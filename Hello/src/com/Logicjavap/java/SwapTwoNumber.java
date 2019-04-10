package com.Logicjavap.java;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {

      int x,y,temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("Entrer the value of x and y ");
      x=sc.nextInt();
      y=sc.nextInt();
      System.out.println("Before swap a numbers are: "+x+"  "+y);
      temp=x;
      x=y;
      y=temp;
      System.out.println("After swap numbers are: "+x+" "+y);
      
	}

}
