package com.IBMTest.java;

public class SecondLargest {
	public static int getSecondlargest(int[] a,int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total=total-2];
	}

	public static void main(String[] args) {

       int a[]= {1,4,7,5,2,3};
       int b[]= {20,44,4,77,99,2,4};
       
       System.out.println("Second Largest:"+getSecondlargest(a,6));
       System.out.println("Second Largest:"+getSecondlargest(b,7));

	}

}
