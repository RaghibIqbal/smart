package com.Logicjavap.java;

import java.util.HashSet;

public class ArrayDupRemove {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,3,4,5,5};
		
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
	
	for(int no:hs)
	 {
		System.out.print(no+" ");
	 }
	}
}
	

