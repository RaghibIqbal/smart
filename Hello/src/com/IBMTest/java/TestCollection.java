package com.IBMTest.java;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) {
		
		 ArrayList<String> al=new ArrayList<String>();
		al.add("Iqbal Raghib");
		al.add("Sami");
		al.add("Sachin");
		al.add("Ramu"); 
		//Iterator itr=al.iterator();
		
	    //while(itr.hasNext())
		for(String obj:al)
		{
		
			//System.out.println(itr.next());
			System.out.println(obj);
			
		}
	}
}