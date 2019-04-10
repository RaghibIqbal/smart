package com.Logicjavap.java;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str1="Grab";
		String str2="Brag";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length())
		{
			System.out.println("both string are not Anagram");
		}
		char string1[]=str1.toCharArray();
		char string2[]=str2.toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);
		if(Arrays.equals(string1, string2)==true)
		{
			System.out.println("Both string are  Anagram");
		}
		else
		{
			System.out.println("Both string are not Anagram");
		}
	}

}
