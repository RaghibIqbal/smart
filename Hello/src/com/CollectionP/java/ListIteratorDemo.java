package com.CollectionP.java;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("Bala");
	l.add("Benki");
	l.add("Chiny");
	l.add("Vinky");
	System.out.println(l);
	ListIterator ltr=l.listIterator();
	while(ltr.hasNext())
	{
		String s=(String)ltr.next();
		if(s.equals("Venky"))
		{
			ltr.remove();
			if(s.equals("Nagi"))
			{
				ltr.add("Chiru");
				if(s.equals("chiru"))
				{
					ltr.add("Charu");
				}
				System.out.println(l);
			}
		 }
	  }

	}

}
