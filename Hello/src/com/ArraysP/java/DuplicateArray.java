package com.ArraysP.java;

import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {

       String stArray[]= {"java","jdbc","servlet","jsp","hibernate","spring","java"};
       for(int i=0;i<stArray.length-1;i++)
       {
    	   for(int j=i+1;j<stArray.length;j++)
    	   {
    		   if(stArray[i].equals(stArray[j])&&(i!=j))
    		   {
    			   System.out.println("duplicate array element is  "+stArray[i]);
    		   }
    	   }
       }
       HashSet<String> set=new HashSet<String>();
       for (String string : stArray) {
    	   if(!set.add(string))
    	   {
    		   System.out.println("duplicate element in hashset  "+string);
    	   }
		
	}

	}

}
