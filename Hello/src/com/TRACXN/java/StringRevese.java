package com.TRACXN.java;

public class StringRevese {

	public static void main(String[] args) {
		int r= 9;
	    int c=5;
	    int count=5;
	    for(int i=1;i<=5;i++)
	    {
	    	
	    	for(int j=1;j<=5;j++)
	    	{
	    		
	    		if(j<=6-i)
	    		{
	    			System.out.print(count--);
	    		}
	    		else
	    		{
	    			System.out.print(" ");
	    		}
	    		
	    		
	    		 
	    	}
	    	count=5;
	    	System.out.println();
	    }
	    	
	    for(int i=2;i<=5;i++)
	 	    {
	 	    	for(int j=1;j<=5;j++)
	 	    	{
	 	    		
	 	    		if(j<=i)
	 	    		{
	 	    			System.out.print(count--);
	 	    		}
	 	    		else
	 	    		{
	 	    			System.out.print(" ");
	 	    		}
	 	    		
	 	    		 
	 	    	}
	 	    	count=5;
	 	    	System.out.println();
	    	
	    
		    }
	    }
	    
		
}


