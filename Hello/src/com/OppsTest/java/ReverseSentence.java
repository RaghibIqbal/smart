package com.OppsTest.java;

import java.util.Scanner;

public class ReverseSentence {
	public static String reverseTheSentence(String str)
	{
		String st[]=str.split("\\s");
		String s="";
		for(int i=st.length-1;i>=0;i--)
		{
			s=s+st[i]+"";
		}
		return s;
		
	}

	public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the any sentence");
      String str=sc.nextLine();
      String s=reverseTheSentence(str);
      System.out.println("input sentence  "  +str);
      System.out.println("output sentence  "  +s);

	}

}
