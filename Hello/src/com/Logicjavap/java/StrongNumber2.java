package com.Logicjavap.java;

public class StrongNumber2 {

	public static void main(String[] args) {

      int input=145;
      int temp,mod,sum=0;
      temp=input;
      while(input>0)
      {
    	  mod=input%10;
    	  sum=sum+fact(mod);
    	  input=input/10;
    	  
      }
      if(temp==sum)
      {
    	  System.out.println(temp+"  is strong number");
    	  
      }
      else
      {
    	  System.out.println(temp+"  is strong number");
      }

	}
	public static int fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
		
		}
	}


