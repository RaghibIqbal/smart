package com.Logicjavap.java;

public class ArraySortAsc {

	public static void main(String[] args) {
		 int arr[]= {1,2,76,4,39,9};
		 int temp=0;
		 System.out.println("Origonal Array");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 System.out.println();
		 System.out.println("After sorting and ascending order");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
	}

}
