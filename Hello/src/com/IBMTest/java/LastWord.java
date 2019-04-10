package com.IBMTest.java;

import java.util.Scanner;

public class LastWord {
	public static String lastWord(String []copy) 
	{
		String result="";
		for(int i=0;i<copy.length;i++)
		{
			result=" "+copy[copy.length-1];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String input=sc.nextLine();
		String copy[]=input.split(" ");
		String result=lastWord(copy);
		System.out.println(result);
		
	}

}

