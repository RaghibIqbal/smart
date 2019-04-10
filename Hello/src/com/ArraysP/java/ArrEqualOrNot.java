package com.ArraysP.java;

public class ArrEqualOrNot {

	public static void main(String[] args) {

      int arr1[]= {1,2,4,7,4};
      int arr2[]= {1,2,4,7,4};
      
      boolean arrEqual=true;
       if(arr1.length==arr2.length)
       {
      for(int i=0;i<arr1.length;i++)
      {
    	  if(arr1[i]!=arr2[i])
    	  {
    		  arrEqual=false;
    	  }
      }
       }
    	  else
    	  { 
    		  arrEqual=false;
    	  }
    	  if(arrEqual)
    	  {
    		  System.out.println("Two Array are Equal");
    	  }
    	  else
    	  {
    	      System.out.println("Two Arrays are NOT equal");
    	  }
    	  
      }
       }

