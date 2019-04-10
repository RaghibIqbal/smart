package com.Pattern.java;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
     // int r,c;
      int n;
      int num=1;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter any number of row you want to print");
      n = sc.nextInt();
     /* for(r=1;r<=n;r++)
      {
    	  for(c=1;c<=r;c++)
    	  {
    		  System.out.print(num+" ");
    		  num++;
    	  }
    	  System.out.println(" ");
      }  */
      for(int i=1;i<=4;i++)
      {
    	  for(int j=1;j<=i;j++)
    	  {
    		  System.out.print(num+" ");
    		  num++;
    	  }
    	  System.out.println();
      }
      }

	}

/**1
   2 3
   4 5 6
   7 8 9 10*/
