package com.Logicjavap.java;

public class PunctuationCount {

	public static void main(String[] args) {

       String str="Hii!How are you?Are you going office?";
       int count=0;
       for(int i=0;i<str.length();i++)
       {
    	   if(str.charAt(i)==','||str.charAt(i)==';'||str.charAt(i)=='!'||str.charAt(i)=='?')
    	   {
    		   count++;
    	   }
       }
       System.out.println("total number of punctuation:"+count);
	   }

	}


