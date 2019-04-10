package com.IBMTest.java;

import java.util.Scanner;

public class UpToLowVS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String input=sc.next();
		
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if(c>=65&&c<=90)
			{
		            c=(char) (c+32);
			}
			else
			{
				c=(char)(c-32);
			}
	         System.out.print(c);
			
		}
		
	}

}
