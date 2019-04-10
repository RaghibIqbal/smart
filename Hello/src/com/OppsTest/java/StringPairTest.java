package com.OppsTest.java;

public class StringPairTest {

	public static void main(String[] args) {

		       String s="aaaaabbbccccgggeee";
		       String str="";
		       for(int i=0;i<s.length();i++)
		       {
				if(i+1>=s.length())
		    	   {
		    		   str=str+s.charAt(i);
		    	   }
				else if(s.charAt(i)==s.charAt(i+1))
				{
					i=i+1;
					continue;
					
				}
				str=str+s.charAt(i);
				
		       }
			
    	  System.out.println(str);
	}
}

