package com.Mappro.java;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {

      Scanner scr=new Scanner(System.in);
      System.out.println("Enter any sentence");
      String str=scr.nextLine();
      //System.out.println("Enter any sentence");
      str=str.replace(",","");
      str=str.replace(";","");
      str=str.replace("?","");
      str=str.replace(":","");
      str=str.replace("/","");
      str=str.replace("=","");
     // str=str.replace("\\s", "");
      str=str.toLowerCase();
      
      String wordArray[]=str.split("\\s+");
      Map<String,Integer> map=new TreeMap<String,Integer>();
      
      for (String string: wordArray) {
    	  
      
    	  if(map.containsKey(string))
    	  {
    		  
    		  map.put(string, map.get(string)+1);
    	  }
    	  else
    	  {
    		  map.put(string, 1);
    	  }
      }
		for(Map.Entry<String, Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"----->"+entry.getValue());
		}
	}
}

	


