package com.bridgelabz.stringarray;

import com.utility.Utility;

public class MatrixMultiplicationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the first matrix of row and col:");
		int row1 = Utility.getInt();
		int col1 = Utility.getInt();
		int [][] matrix = new int [row1][col1];
		
		Utility.inputOfIntMatrix(matrix, row1, col1);
		
		System.out.println("Enter the second matrix of row and col:");
		int  row2 = Utility.getInt();
	     int col2 = Utility.getInt();
	     int [][] matrix2 = new int [row2][col2];
	     
	     Utility.inputOfIntMatrix(matrix2, row2, col2);
	     //Utility.printIntMatrix(matrix, row, col);
	     int [][] multiplication = new int [row1][col2];
	     
	     for(int i=0;i<row1;i++) {
	    	 for(int j=0;j<col2;j++) {
	    		 for(int k=0;k<col1;k++) {
	    		 multiplication[i][j]+= matrix[i][k] * matrix2[k][j];
	    	 }
	     }
	}
	     System.out.println("multiplication of two matrices is:");
	     for(int i=0;i<row1;i++) {
	    	 for(int j=0;j<col2;j++) {
	    		 
	    		 System.out.print(multiplication[i][j]+ " \t ");
	     }
	    	 System.out.println();
	}
	  
	     for(int i=0;i<row1;i++) {
	    	 for(int j=0;j<col2;j++) {
	    		 for(int k=0;k<col1;k++) {
	    			 multiplication[i][j]+=matrix[i][k] + matrix2[k][j]; 
	    		 }
	    	 }
	     }
	 
	     System.out.println("addition of two matrices is:");
	     for(int i=0;i<row1;i++) {
	    	 for(int j=0;j<col2;j++) {
	    		 System.out.print(multiplication[i][j]+ " \t ");

	    	   }
	    	 			System.out.println();
               }
          }
}