package com.Pattern.java;

public class Smpattern12 {

	public static void main(String[] args) {

     int minstars=1;
     int height=5;
     int space=height-1;
     for(int i=0;i<height;i++)
     {
    	 for(int j=space;j>i;j--)
    	 {
    		 System.out.print(" ");
    		 
    	 }
    	 for(int k=0;k<minstars;k++)
    	 {
    		 System.out.print("*");
    	 }
    		 //minstars+=2;
    	     minstars=minstars+2;
    		 System.out.println();
    	 }
     }
	}


