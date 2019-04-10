package com.Pattern.java;

public class Pattern11 {

	public static void main(String[] args) {
		int starcount=1;
     for(int i=1;i<=5;i++)
     {
    	 for(int j=1;j<=starcount;j++)
    	 {
    		 System.out.print("* ");
    	 }
    	 System.out.println(" ");
    	 starcount +=2;
     }
	}
	}