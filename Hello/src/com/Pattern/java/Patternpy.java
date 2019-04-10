package com.Pattern.java;

public class Patternpy {

	public static void main(String[] args) {

      int r,sp, p;
      int no=5;
      int n=no;
      int value=1;
      for( r=1;r<=no;r++)
      {
    	  for(sp=1;sp<=n;sp++)
    	  {
    		  System.out.print(" ");
    	  }
    	  n--;
    	  for(p=1;p<=r;p++)
    	  {
    		  System.out.print(r+" ");
    		  value++;
    	  }
    
    	  System.out.println();
      }
      
	}
}/*     1
       2 2
      3 3 3*/