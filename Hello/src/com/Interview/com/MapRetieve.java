package com.Interview.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRetieve {

	public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("Durga", 101);
        map.put("Iqbal",102);
        map.put("Raj",103);
        
        Set s1=map.entrySet();
        Iterator itr=s1.iterator();
        while(itr.hasNext())
        {
        	Map.Entry<String, Integer> map1=(Map.Entry<String, Integer>)itr.next();
        	System.out.println(map1.getKey()+"--> "+map1.getValue());
        }

	}

}
