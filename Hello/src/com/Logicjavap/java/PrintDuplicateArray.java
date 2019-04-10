package com.Logicjavap.java;

public class PrintDuplicateArray {

	public static void main(String[] args) {

       int arr[]= {1,2,4,2,23,4,5,6,7,7};
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=i+1;j<arr.length;j++)
    	   {
    		   if(arr[i]==arr[j])
    		   {
    			   System.out.println(arr[j]);
    		   }
    	   }
       }

	}

}
