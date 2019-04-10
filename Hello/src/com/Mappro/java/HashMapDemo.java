package com.Mappro.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		
		System.out.println(map);
		System.out.println("-----------------");
		
		Collection<String> values=map.values();
		
		for (String string : values) {
			
			System.out.println(string);
		}
	}

}
