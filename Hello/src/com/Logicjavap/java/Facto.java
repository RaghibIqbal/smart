package com.Logicjavap.java;

import java.util.Scanner;

public class Facto {

	public static void main(String[] args) {

       int n,fact=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
    	   fact=fact*i;
       }
       System.out.println("factorial is:"+n+" "+fact);

	}

}
