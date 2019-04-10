package com.Logicjavap.java;

public class ArrayDsc {

	public static void main(String[] args) {

       int arr[]= {5,3,45,57,98,9,30,7};
       int temp=0;
       System.out.println("Original Array");
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.print(arr[i]+" ");
       }
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=i+1;j<arr.length;j++)
    	   {
    		   if(arr[i]<arr[j])
    		   {
    			   temp=arr[i];
    			   arr[i]=arr[j];
    			   arr[j]=temp;
    		   }
    	   }
       }
     System.out.println();
     System.out.println("array in dsc order");
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.print(arr[i]+" ");
     }
	}

}
