package com.Interview.com;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {

       String a,b="";
       Scanner scr=new Scanner(System.in);
       System.out.println("Enter any Sentence");
       a=scr.nextLine();
       int n=a.length();
       for(int i=n-1;i>=0;i--)
       {
    	   b=b+a.charAt(i);
       }
       if(a.equalsIgnoreCase(b))
       {
    	   System.out.println("The String is palindrom");
       }
       else
       {
    	   System.out.println("Given String is not palindrom");
       }

	}

}
