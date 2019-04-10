package com.Logicjavap.java;

public class Array3rdLargest {

	public static void main(String[] args) {

       int arr[]= {1,2,5,6,3,2};
       int k=3;
       
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=i+1;j<arr.length;j++)
    	   {
    		   if(arr[i]<arr[j])
    		   {
    			 int temp=arr[i];
    			 arr[i]=arr[j];
    			 arr[j]=temp;
    		   }
    	   }
    	   if(i==k-1)
    	   {
    		   System.out.println(k+"is largest array Element:"+arr[i]);
    		   break;
    	   }
       }
      
	}

}
