package com.IBMTest.java;

import java.util.Scanner;

public class RemoveVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String input=sc.nextLine();
		StringBuffer sb=new StringBuffer(input);
		for(int i=0;i<sb.length();i++)
		{
			switch(sb.charAt(i))
			{
			case('a'):
			case('e'):
			case('i'):
			case('o'):
			case('u'):
				sb.deleteCharAt(i);
			i=i-1;
			break;
			}
		}
		System.out.println(sb.toString());



	}

}
