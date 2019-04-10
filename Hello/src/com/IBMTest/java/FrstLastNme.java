package com.IBMTest.java;

public class FrstLastNme {

	public static void main(String[] args) {
		String s="Raghib Iqbal";
		String last="";
		String first="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				//last=last+s.substring(i+1);
				first=first+s.substring(0,i);
				last=last+s.substring(i+1);
			}
			
		}
		System.out.println(last+" "+first);

	}

}
