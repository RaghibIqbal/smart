package com.StringProg.java;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Raghib Iqbal ";
		
		StringBuffer sb=new StringBuffer(str);
		
		System.out.println(sb.reverse());
		System.out.println("-------------------------");
		
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
			
			
			
		}
		System.out.println("---------------");
		System.out.print(revString(str));
	}
	static String revString(String str)
	{
		if((null==str)||(str.length()<=1))
		{
			return str;
		}
		return (str.substring(1))+str.charAt(0);
	}

}
