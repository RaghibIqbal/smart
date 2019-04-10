package com.Logicjavap.java;

public class ArmstrongNumberDemo {
static int s;

	public static void main(String[] args) {
        //String s;
        System.out.println(s);
         int c=0,r,temp;
        int n=153;
         temp=n;
         while(n>0)
         {
         r=n%10;
         n=n/10;
         c=c+r*r*r;
         }
         if(temp==c)
         {
        	 System.out.println("The number is armstrong");
         }
         else
         {
        	 System.out.println("Number is not Armstrong");
         }

	}

}
