package com.Logicjavap.java;

public class IncmtAdd {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int count=0;
		int k=0;
		int sum=0;
		int m=0;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<=k;j=j+count)
			{
			sum=sum+arr[j];
			m++;
			count++;
			}
			sb.append(sum);
			sum=0;
			
			k=k+m;
			 
		}
		System.out.println(sb);

	}

}
