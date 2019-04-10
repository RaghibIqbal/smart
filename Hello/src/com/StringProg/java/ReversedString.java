package com.StringProg.java;

public class ReversedString {

	public static void main(String[] args) {

       String str="Raghib Iqbal";
       String reversedStr=" ";
       for(int i=str.length()-1;i>=0;i--)
       {
    	   reversedStr=reversedStr+str.charAt(i);
       }
       System.out.println(reversedStr);
	}

}
