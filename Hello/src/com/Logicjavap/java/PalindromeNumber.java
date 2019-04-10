package com.Logicjavap.java;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

      int a,no,b,temp=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any number:");
      no=sc.nextInt();
      b=no;
      while(no>0)
      {
    	  a=no%10;
    	  no=no/10;
    	  temp=temp*10+a;
      }
    	  if(temp==b)
    	  {
    		 
    		  System.out.println("The number is palindrom:");
    		  
    	  }
      
    	  else
      
    	  {
    		  
    		  System.out.println("the number is not palindrome:");
    	  }
    	 
      }
      
	

}
