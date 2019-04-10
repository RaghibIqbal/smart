package com.IBMTest.java;

import java.util.Scanner;

public class DesireChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence?");
		String input=sc.next();
		System.out.println("Enetr a Desire Character?");
		char c=sc.next().charAt(0);
		int flag=0;
		char ch = 0;
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			if(ch==c)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Desire character is:- "+ch);
		}
		else
		{
			System.out.println("Desire character is not Available");
		}
		



	}

}
