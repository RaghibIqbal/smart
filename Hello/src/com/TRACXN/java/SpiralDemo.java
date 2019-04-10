package com.TRACXN.java;

import java.util.Arrays;

public class SpiralDemo {

	public static void main(String[] args) {
		int n=9;
		int arr[][]=new int[n][n];
		int count=1;
		int maxrow=n-1;
		int maxcol=n-1;
		int minrow=0;
		int mincol=0;
		while(count<=n*n) {
		for(int i=mincol;i<=maxcol;i++)
		{
			arr[minrow][i]=count++;
		}
		for(int i=minrow+1;i<=maxrow;i++)
		{
			arr[i][maxcol]=count++;
		}
		for(int i=maxcol-1;i>=mincol;i--)
		{
			arr[maxrow][i]=count++;
		}
		for(int i=maxrow-1;i>=minrow+1;i--)
		{
			arr[i][mincol]=count++;
		}
		
		minrow++;
		mincol++;
		maxrow--;
		maxcol--;
		}

for(int []k:arr)
{
	System.out.println(Arrays.toString(k));
}
		
	}

}
