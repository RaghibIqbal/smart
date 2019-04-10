package com.Interview.com;

import java.util.Scanner;

public class MatrixCreation {

	public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of rows");
      int rows=sc.nextInt();
      System.out.println("Enter the number of column");
      int cols=sc.nextInt();
      
      int [][] matrix=new int[rows][cols];
      System.out.println("Enter the matrix data");
      
      for(int i=0;i<rows;i++)
      {
    	  for(int j=0;j<cols;j++)
    	  {
    		  matrix[i][j]=sc.nextInt();
    	  }
      }
      System.out.println("your matrix is ");
      for(int i=0;i<rows;i++)
      {
    	  for(int j=0;j<cols;j++)
    	  {
    		  System.out.print(matrix[i][j]+"  ");
    		  
    	  }
    	  System.out.println();
      }

	}

}
