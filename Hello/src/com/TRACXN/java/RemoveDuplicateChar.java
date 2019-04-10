package com.TRACXN.java;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str="rajtresaukumar";
		String str1="rajukumari";
		int count=0;
		String result="";
		int i;
		int j;
		for(i=0;i<str.length();i++)
		{
			for(j=0;j<str1.length();j++)
			{
				if(str.charAt(i)==str1.charAt(j))
				{
					count++;
					break;
					//continue;
				}
				else if(str.charAt(i)!=str1.charAt(j))
				{
					result=result+" "+str.charAt(i);
					break;
					//continue;
				}
			}
		}
		System.out.println(count);
		System.out.println(result);

	}

	
	}


