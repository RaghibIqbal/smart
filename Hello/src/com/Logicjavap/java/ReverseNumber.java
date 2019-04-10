package com.Logicjavap.java;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=123456;
		while(n>0)
		{
			System.out.print(n%10);
			n/=10;
		}

	}

}
