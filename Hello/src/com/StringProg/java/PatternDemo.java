package com.StringProg.java;

public class PatternDemo {

	public static void main(String[] args) {
		
		int n=4;
		int m=n+3;
		int arr[][]=new int[n][m];
		
		int k=1;
		int p=0;
		int minrow=0;
		int maxrow=n-1;
		while(n>0)
		{
			if(minrow<maxrow)
			{
				if(p==0)
				{
					for(int i=minrow;i<=minrow;i++)
					{
						for(int j=0;j<m;j++)
						{
							if(j%2!=0)
							{
								System.out.print(k++);
							}
							else 
							{
								System.out.print("*");
							}
						}
						System.out.println();
					}
					minrow++;
					p=1;
				}
				if(p==1) 
				{
		
					for(int i=maxrow;i>=maxrow;i--)
					{
						for(int j=0;j<m;j++)
						{
							if(j%2!=0)
							{
								System.out.print(k++);
							}
							else
							{
								System.out.print("*");
							}
						}
						System.out.println();
					}					
					maxrow--;
					p=0;
					
				}
			}
			n--;
		}

	}

}
