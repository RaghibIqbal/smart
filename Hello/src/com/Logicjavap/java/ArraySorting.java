package com.Logicjavap.java;
import java.util.*;
import java.lang.*;

public class ArraySorting {

	public static void main(String[] args) {

      // System.out.println("Hey how are you");
       int arr[]= {8,2,7,99,3,5,77};
       /*sortingArray(arr);
	}

	private static void sortingArray(int arr[]) {
       
       
	System.out.println("who i m"+arr.length); 
       for(int i=0;i<arr.length-1;i++)
       {
    	 for(int j=0;j<arr.length-1;j++)
    	 {
    		 if(arr[j]>arr[j+1])
    		 {
    			 int temp=arr[j+1];
    			 arr[j+1]=arr[j];
    			 arr[j]=temp;
    		 }
    	 }
       }
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.println("I m iqbal  "  +arr[i]);
       }
		*/
       for(int i=0;i<arr.length-1;i++) {
    	   for(int j=i+1;j<arr.length;j++)
    	   {
    		   if(arr[i]>arr[j])
        	   {
        		   int temp = arr[i];
        		   arr[i]=arr[j];
        		   arr[j]=temp;
        		   //arr[i-1]=arr[i]+(arr[i]=arr[i-1])-arr[i];
        	   } 
    	   }
    	   
       }
       System.out.println(Arrays.toString(arr));
	}
}


