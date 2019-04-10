package com.TRACXN.java;

import java.util.Scanner;

public class CountCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("ENter any sentence");
        String str =sc.nextLine();
        count(str);
	}
	public static void count(String str)
	{
	   char[] ch = str.toCharArray();
	   for(int i=0;i<ch.length;i++)
	   {
		   String s="";
		   while(i<ch.length && ch[i] !=' ')
		   {
			  s=s+ch[i];
			  i++;
		   }
		   System.out.println(s+"-->"+s.length());
	   }
	}

}
