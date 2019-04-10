package com.IBMTest.java;

public class FirstWordCapital {

	public static void main(String[] args) {
		String str="raju kumar soni";
		String[] r=str.split("\\s");
		String result="";
		for(String a:r)
		{
			String first=a.substring(0,1);
			String last=a.substring(1);
			result+=first+last.toUpperCase()+" ";
		}
		System.out.println(result);
		

	}

}
