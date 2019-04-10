package com.TRACXN.java;

public class MixArrChar {
	public static String[] mix(int[] arr,char[] ch)
	{
		String result[]=new String[arr.length+ch.length];
		int i=0,j=0,k=0,m=0;
		for(int a=0;a<result.length;a++)
		{
			
			
				while(i<arr.length&&j<ch.length)
				{
					if(m==0)
					{
					result[k++]=" "+ch[j++];
					m=1;
					}
					else if(m==1)
					{
				
					result[k++]=" "+arr[i++];
					m=0;
					}
			   }
				
				while(i<arr.length)
				{
					result[k++]=" "+arr[i++];
				}
				while(j<ch.length)
				{
					result[k++]=" "+ch[j++];
				}
				
		}
		return result;
		
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		char ch[]= {'A','B','C','D','E','F','G','H','I'};
		String result[]=mix(arr,ch);
		for(String s:result)
		{
		System.out.println(s);
		}
				

	}

}
