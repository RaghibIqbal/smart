package com.TRACXN.java;

public class StringRemove {

	public static void main(String[] args) {

       String str="Hello there";
       StringBuffer sb=new StringBuffer(str);
       String str1="llo";
       for(int i=0;i<str1.length();i++)
       {
    	   for(int j=0;j<sb.length();j++)
    	   {
    		  if(str1.charAt(i)==sb.charAt(j))  
    		   {
    			   sb.deleteCharAt(j);
    		   }
    	   }
       }
       System.out.println(sb.toString());

	}

}
