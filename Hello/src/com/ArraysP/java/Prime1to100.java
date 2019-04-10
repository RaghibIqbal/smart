package com.ArraysP.java;

public class Prime1to100 {

	public static void main(String[] args) {

       int limit=100;
       
       System.out.println("prime number 1 to"+limit);
       for(int i=2;i<100;i++)
       {
    	   boolean isPrime=true;
       
       for(int j=2;j<i;j++)
       {
    	   if(i%j==0)
    	   {
    		   isPrime=false;
    		   break;
    	   }
       }
    	   if(isPrime)
    	   
    		   System.out.println(i+"  ");
    	   }
       } 
       
      
	}

