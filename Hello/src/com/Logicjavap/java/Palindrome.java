package com.Logicjavap.java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

       String a,b;
       StringBuffer sb;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String is Palindrom or not:");
       a=sc.nextLine();
       sb=new StringBuffer(a);
       b=sb.reverse().toString();
       if(a.equals(b))
           {
    	   System.out.println("Enter String String is Palindrome:");
    	   
    	   }
       else
       {
    	   System.out.println("Enter String is not palindrom:");
       }
	}

}
