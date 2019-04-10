package com.Logicjavap.java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

      int num;
      int temp;
      int sum=0;
      int i=1;
      int n=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any number:");
      num=sc.nextInt();
      i=num;
      while(num>0)
      {
    	  n=num%10;
    	  num=num/10;
    	  sum=sum+(n*n*n);
      }
      if(sum==i)
      {
    	  System.out.println(i+"is an ArmstongNumber");
      }
      else
      {
    	  System.out.println(i+"is not an ArmstrongNumber");
      }
      

	}

}
