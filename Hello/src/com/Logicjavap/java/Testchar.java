package com.Logicjavap.java;

public class Testchar {

	public static void main(String[] args) {

      String str="abc123def456";
      int count=0;
     
	char ch[]=str.toCharArray();
      for(int i=0;i<str.length();i++)
      {
    	  if(ch[i]>97)
    	  {
    		  System.out.print(ch[i]);
    		  count++;
    	  }
    	  //System.out.println(count);
      }
      System.out.println(count);

	}

}
