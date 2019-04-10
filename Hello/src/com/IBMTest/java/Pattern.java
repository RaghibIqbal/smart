package com.IBMTest.java;

import javax.jws.soap.SOAPBinding;

public class Pattern {

	public static void main(String[] args) {
		int n=6;
		int m=n*2-1;

      int count=1;
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=m;j++)
    	  {
    		  if(j<=count)
    		  {
    			  System.out.print("*");
    		  }
    		  else
    		  {
    			  System.out.print("");
    		  }
    	  }
    	  System.out.println();
    	  count+=2;
      }
    	  /*for(int j=1;j<=count;j++)
    	  {
    		  System.out.print("* ");
    	  }
    	  System.out.println();
    	  count+=2;
      }*/
	}

}
