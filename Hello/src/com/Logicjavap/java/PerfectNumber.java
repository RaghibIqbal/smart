package com.Logicjavap.java;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

      int n,i=1,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the any number:");
      n=sc.nextInt();
      while(i<=n/2)
      {
    	  if(n%i==0)
    	  {
    		  sum=sum+i;
    	  }
    			  i++;//1+4+7+2+14
      }
      
          if(sum==n)
           {
    	  System.out.println("the number is perfect is:-  " +n);
    	  
    	  }
          else
          {
    	  System.out.println("the number is not perfecct is:-  " +n);
          }
    	  }
      
	}


