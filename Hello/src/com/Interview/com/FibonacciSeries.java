package com.Interview.com;

public class FibonacciSeries {

	public static void main(String[] args) {

       int k=10,a=0,b=1;
       System.out.print(a);
       System.out.print(b);
       for(int i=2;i<k;i++)
       {
    	   int c=a+b;
    	   System.out.println(c);
    	   a=b;
    	   b=c;
       }

	}

}
