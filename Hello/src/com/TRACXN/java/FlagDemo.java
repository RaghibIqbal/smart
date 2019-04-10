package com.TRACXN.java;

import java.util.Scanner;

public class FlagDemo {
	public static String function1(String str,int flag)
	{
		String result="";
		if(flag==0)
		{
			for(int i=0;i<str.length();i=i+2)
			{
				result=result+str.charAt(i);
			}
		}
		else if(flag==1)
		{
			for(int i=1;i<str.length();i=i+2)
			{
				result=result+str.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the flag 0 or 1");
		int flag=sc.nextInt();
		String str="TRACXN";
		String result=function1(str,flag);
		System.out.println(result);
		

	}

}
