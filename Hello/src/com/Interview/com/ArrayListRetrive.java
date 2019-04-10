package com.Interview.com;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRetrive {

	public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<=10;i++)
        {
        	list.add(i);
        }
        System.out.println(list);
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
        	Integer in=(Integer)itr.next();
        	System.out.println(in);
        }
      

	}

}
