package com.Mappro.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRetrive {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("Raj",101);
		map.put("Raju",102);
		map.put("Iqbal",103);
		map.put("Sony",104);
		Set s1=map.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> map1=(Map.Entry<String, Integer>)itr.next();
			System.out.println(map1.getKey()+"---->"+map1.getValue());
		}
	}

}
