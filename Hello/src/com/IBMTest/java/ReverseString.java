package com.IBMTest.java;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			result=str.charAt(i)+result;
			
		}
		System.out.println(result);

	}

}
