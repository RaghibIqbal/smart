package com.Pattern.java;

import java.util.Scanner;

public class RaghibIqbal {

	public static void main(String[] args) {

      int array[]= {10,0,-1,20,25,30};
      Scanner sc=new Scanner(System.in);
    		  System.out.println("Enter the required input:");
           
    		  int n=sc.nextInt();
    		  for(int i=0;i<array.length-1;i++)
    		  {
    			  for(int j=0;j<array.length;j++)
    			  {
    				  if(array[i]+array[j]==n)
    				  {
    					  System.out.println("[ "+array[i]+", "+array[j]+" ]");
    				  }
    			  }
    		  }
	}

}
