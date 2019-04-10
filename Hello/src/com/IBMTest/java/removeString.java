package com.IBMTest.java;
import java.util.Scanner;

public class removeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence with white Space:-");
		String str=sc.nextLine();
		//System.out.println(str);
		/*String result=str.replaceAll("\\s","");
		System.out.println(result);*/
		char []ch=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				sb.append(ch[i]);
			}
		}
		System.out.println(sb.toString());

	}

}
