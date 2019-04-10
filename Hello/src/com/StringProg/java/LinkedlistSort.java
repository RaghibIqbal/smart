package com.StringProg.java;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedlistSort {

	public static void main(String[] args) {
      
		LinkedList<Integer> list=new LinkedList<Integer>();
		 
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(5);
		list.add(3);
		System.out.println("original value"+list);
		//list.size();
		System.out.println("total size   "+list.size());
		
		Collections.sort(list);
		System.out.println("Asending order"+list);

		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Disending order"+list);

	}

}
