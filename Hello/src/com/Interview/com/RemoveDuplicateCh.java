package com.Interview.com;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCh {

	public static void main(String[] args) {

          String st="raaghiiib";
         
         System.out.println("Remove duplicate char "+removeDup(st));
	}
	static String removeDup(String st)
	{   
		
	    char ch[]=st.toCharArray();
		Set<Character> set=new HashSet<Character>();
		for(char c:ch)
		{
			set.add(c);
		}
		StringBuffer sb=new StringBuffer();
		for(char cc:set)
		{
			sb.append(cc);
		}
		return sb.toString();
	}
}
