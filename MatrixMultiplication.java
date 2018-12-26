package com.bridgelabz.stringarray;

import java.util.Scanner;

import com.utility.Utility;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
	       System.out.println("Enter rows and column of first matrix");
	       int r1 = scan.nextInt();
	       int c1 = scan.nextInt();
	       int mat1[][] = new int[r1][c1];
	       System.out.println("Enter rows and column of second matrix");
	       int r2= scan.nextInt();
	       int c2 = scan.nextInt();
	       int mat2[][] = new int[r2][c2];
	       int mul[][] = new int[r1][c2];
	       System.out.println("Enter element of first matrix");
	       for(int i  = 0; i < r1;i++)
	       {
	    	   for(int j = 0;j < c1;j++ )
	    	   {
	    		   mat1[i][j] = scan.nextInt();
	    	   }
	       }
	       System.out.println("Enter element of second matrix");
	       for(int i  = 0; i < r2;i++)
	       {
	    	   for(int j = 0;j < c2;j++ )
	    	   {
	    		   mat2[i][j] = scan.nextInt();
	    	   }
	       }
		
		 for(int i  = 0; i < r1;i++)
	     {
	  	   for(int j = 0;j < c2;j++ )
	  	   {
	  		   mul[i][j]=0;
	  		  for(int k =0;k <c1 ;k++)
	  		  {
	  			mul[i][j]+=mat1[i][k]*mat2[k][j];
	  		  }
	  	   }
	     }
		 System.out.println("First matrix");
		
	    Utility.printIntMatrix(mat1, r1, c1);
		 System.out.println("Second matrix");
		  Utility.printIntMatrix(mat2, r2, c2);
		 System.out.println("Multiplication of matrix:");
		 for(int i  = 0; i < r1;i++)
	     {
	  	   for(int j = 0;j < c2;j++ )
	  	   {
	  		   int len = Integer.toString(mul[i][j]).length();
	  		   if(len<2)
	  		  System.out.print(" "+mul[i][j]);
	  		   else
	  			 System.out.print(" "+mul[i][j]);
	  	   }
	  	   System.out.println();
	}

	}

}
