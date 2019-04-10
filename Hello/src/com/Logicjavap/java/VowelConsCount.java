package com.Logicjavap.java;

public class VowelConsCount {

	public static void main(String[] args) {

       String str="Raghib Iqbal";
       int vCount=0,cCount=0;
       str=str.toLowerCase();
       for(int i=0;i<str.length();i++)
       {
    	   if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
    		   {
    		   vCount++;
    		   }
    	   else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
    	   {
    		   cCount++;
    	   }
        }
       System.out.println("total number of vCount"+vCount);
       System.out.println("total number of count"+cCount);

	}

}
