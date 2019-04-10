package com.OppsTest.java;

public class FindDupli {

	public static void main(String[] args) {

      String st[]= {"java","jsp","jdbc","servlet","jsp","html","java"};
      for(int i=0;i<st.length-1;i++)
      {
    	  for(int j=i+1;j<st.length;j++)
    	  {
    		  if(st[i].equals(st[j])&&i!=j)
    			  System.out.println("Duplicate is:"+st[j]);
    	  }
      }

	}

}
