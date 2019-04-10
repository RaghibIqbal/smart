package com.Logicjavap.java;

public class SmallestLargestNumber {

	public static void main(String[] args) {

       int arr[]= new int[]{1,100,20,30,50};
       int largest=Integer.MIN_VALUE;
       int smallest=Integer.MAX_VALUE;
       for(int number:arr)
       {
    	   if(number>largest)
    	   {
    		   largest=number;
    		   
    	   }
       }
       System.out.println("Largest number is:"+largest);
       for(int number:arr)
       {
    	   if(number<smallest)
    	   {
    		   smallest=number;
    	   }
    		   
       }
       System.out.println("Smallest number is:"+smallest);

	}

}
