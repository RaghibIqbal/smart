package com.OppsTest.java;

public class ArrayAdditionTest {

	public static void main(String[] args) {

       int arr[]= {1,2,3,4,5,6,7,8,9,10};
       int count=1;
       int sum=0;
       int tempCount=count;
       for(int i=0;i<arr.length;i++)
       {
    	   sum=0;
    	   tempCount=count;
    	   while(tempCount!=0)
    	   {
    		   sum=sum+arr[i];
    		   tempCount--;
    		   i++;
    		   
    	   }
    	   count++;
    	   i--;
    	   System.out.println(sum+"");
       }

	}

}
