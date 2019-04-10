package com.Logicjavap.java;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="hihi";
		removeDup(str);
		
		//System.out.println(removeDup(s));
	}
	public static void removeDup(String str)
	{
		char[] ch = str.toCharArray();
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(ch[i] !=str.charAt(i))
			{
				s=s+str.charAt(i);
			}
		}
		System.out.println(s);
	}
}
