package com.TRACXN.java;

import java.util.Scanner;

public class Nonrepeatable {

	public static void main(String[] args) {

      String str="iqbala";
       removeDuplicate(str);
      
	}
   public static void removeDuplicate(String str)
   {
	   char[] ch = str.toCharArray();
	   for(int i=0;i<ch.length;i++)
	   {
		  String s="";
		  while(ch.length>0)
		  {
			  if(s.charAt(i) != ch[i])
			  {
				  s=s+ch[i];
			  }
			  i++;
			  System.out.println(s);
		  }
	   }
	   
   }
}
