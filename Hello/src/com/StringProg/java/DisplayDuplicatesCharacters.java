package com.StringProg.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DisplayDuplicatesCharacters {

	public static void main(String[] args) {

        String str="java";
        displayDuplicates(str);

	}
	public static void displayDuplicates(String str)
	{
		Map<Character,Integer> map=new HashMap<>();
		char Characters[]=str.toCharArray();
		for (char c : Characters) {
			if(!map.containsKey(c))
			{
				map.put(c, 1);
			}
			else
			{
			 map.put(c, map.get(c)+1);	
			
			}
			Set<Map.Entry<Character,Integer>> enterySet=map.entrySet();
			for (Entry<Character, Integer> entry : enterySet) {
				if(entry.getValue()>1)
				{
					System.out.printf("%s:%d %n", entry.getKey(),entry.getValue());
				}
			}
		}
	}

}
