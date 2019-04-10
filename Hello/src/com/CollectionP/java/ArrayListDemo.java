package com.CollectionP.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arrlist=new ArrayList<String>();;
		arrlist.add("A");
		arrlist.add("Wicky");
		arrlist.add("B");
		arrlist.add("null");
		System.out.println(arrlist);
		arrlist.remove(0);
		arrlist.add(2,"R");
		System.out.println(arrlist);
		System.out.println("Usin for loop");
		for(int counter=0;counter<arrlist.size();counter++)
		{
			System.out.println(arrlist.get(counter));
		}
		System.out.println("Advance for loop");
		for(String str:arrlist)
		{
			System.out.println(str);
		}
		
		System.out.println("While loop");
		int count=0;
		while(arrlist.size()>count)
		{
			System.out.println(arrlist.get(count));
			count++;
		}
		System.out.println("using Iterator");
		Iterator itr=arrlist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---After sort---");
		Collections.sort(arrlist);
		
		{
			System.out.println(arrlist);
		}
		Collections.swap(arrlist, 1, 3);
		for (String string : arrlist) {
			System.out.println(string);
			
		}
		

	}

}
