package com.bridgelabz.stringarray;

import com.utility.Utility;

public class TranposeMatrix {

	public static void main(String[] args) {
		System.out.println("Enter number of rows and columns of orignal matrix");
		int row = Utility.getInt();
		int col = Utility.getInt();
		int matrix[][] = new int[row][col];
		int trans[][] = new int [col][row]; 
		Utility.inputOfIntMatrix(matrix, row, col);
		System.out.println("Above is a transpose matrix :");

		Utility.printIntMatrix(matrix, row, col);
		
		for(int i  = 0; i < row;i++)
	       {
	    	   for(int j = 0;j < col;j++ )
	    	   {
	    		   trans[j][i] = matrix[i][j]; // to change the original matrix to traspose 
	    	   }
	       }
		System.out.println();
		System.out.println("traspose matrix is given below:");
	    	Utility.printIntMatrix(trans, col, row);//print the tranpose matrix
	    	 int mul[][] = new int[row][row];
	    	 for(int i  = 0; i < row;i++)
	         {
	      	   for(int j = 0;j < row;j++ )
	      	   {
	      		   mul[i][j]=0;
	      		  for(int k =0;k <col ;k++)
	      		  {
	      			mul[i][j]+=matrix[i][k]*trans[k][j];
	      		  }
	      	   }
	         }
	    	 System.out.println();
   	 		 System.out.println("print the addition of that two transpose :");

	    	 Utility.printIntMatrix(mul, row, row);//print the final result of matrix
}
	}


