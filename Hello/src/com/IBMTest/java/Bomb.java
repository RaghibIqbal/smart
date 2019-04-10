package com.IBMTest.java;

public class Bomb {

	public static void main(String[] args) {
		String s[][]= {
				{"x","0","0","x"},
				{"0","x","x","0"},
				{"x","x","0","x"},
				{"0","0","x","x"}
				};
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			
			for(int j=0;j<s.length;j++)
			{
				if(s[i][j]=="x")
				{
					for(int k=i-1;k<=i+1&&k<s.length;k++)
					{
						if(k<0)
						{
							continue;
						}
						for(int m=j-1;m<=j+1&&m<s.length;m++)
						{
							if(m<0)
							{
								continue;
							}
							if(s[k][m]=="0")
							{
								count++;
							}
						}
					}
					if(count>0)
					{
						s[i][j]=""+count;
						count=0;
					}
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}

	}

}
