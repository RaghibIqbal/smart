package com.CollectionP.java;

import java.util.Arrays;

public class WordSorting {

	public static void main(String[] args) {
		String s="Succeses consists of incremental effort without enthusiasm";
		char str[]=s.toCharArray();
        for(int i=0;i<str.length;i++)
		{
			if(str[1]>96)
			{
				str[1]=(char)(str[1]-32);
			}
			else if(str[i]==' ')
			{
				str[i+2]=(char) (str[i+2]-32);
			}
		}
		String arr[]=new String[7];
		int k=0;
		String das="";
		for(int i=0;i<str.length;i++)
		{
			if(str[i]!=' ')
			{
				das=das+""+str[i];
			}
			else
			{
				arr[k++]=das;
				das="";
			}		
		}
		if(arr.length<=7)
		{
			arr[k++]=das;
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].charAt(1)>arr[j].charAt(1))
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//System.out.println(Arrays.toString(arr));
	}

}
