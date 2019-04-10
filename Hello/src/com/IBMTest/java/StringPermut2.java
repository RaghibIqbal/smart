package com.IBMTest.java;

import java.util.Scanner;

public class StringPermut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter any string:");
		//f1(sc.nextLine());
		String str2="abc";
		String str1="";
		f1(str1,str2);
	}
	/*public static void f1(String str2)
	{
		f1("", str2);
	}*/
	public static void f1(String str1,String str2)
	{
		//String str1="";
	   if(str2.length() ==0)
	   {
		   System.out.println(str1);
	   }
	   else {
		   for(int i=0;i<str2.length();i++)
		   {
			   f1(str1+str2.charAt(i),str2.substring(0,i)+str2.substring(i+1,str2.length()));
			  // f1(str1+str2.charAt(i),str2.substring(0,i)+str2.substring(i+1,str2.length()));
		   }
	   }
	}

}
