package com.Logicjavap.java;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void shift(int n,String startPole,String intermediatePole,String endPole)
	{
		if(n==0)
		{
			return;
		}
		shift(n-1,startPole,intermediatePole,endPole);
		System.out.println("Move \""+n+"\"frome"+startPole+"---->"+endPole);
	    shift(n-1,intermediatePole,startPole,endPole);
		
	}

	public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number Discs:");
       int numberofDiscs=sc.nextInt();
       shift(numberofDiscs,"Pole1","Pole2","Pole3");

	}

}
