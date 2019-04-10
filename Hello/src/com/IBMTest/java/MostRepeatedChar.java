package com.IBMTest.java;

import java.util.Arrays;
import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

public class MostRepeatedChar {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		String s=sc.nextLine();*/
		String s="raaaaajjjjjuuuuuuuuuuuuuuuuuuuuu";
		char[] arr=s.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int count=1;
		int max=0;
		char alp='0';
			for(int i=1;i<arr.length;i++)
			{
					if(arr[i-1]==arr[i])
					{
						count++;
					}
					
					else
					{
						
						if(count>max)
						{
							max=count;
							alp=arr[i-1];
							}
						count=1;
						}
					}
			        System.out.println();
					
					if(count>max)
					{
						System.out.println(count+" "+arr[arr.length-1]);
						
					}
					else
					{
						System.out.println(max+" "+alp);
				    }
	            }
	        }
