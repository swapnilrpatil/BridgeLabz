package com.bridgelabz.stringarray;

import com.utility.Utility;

public class DeterminantDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter row and col size for matrix :");
		int row = Utility.getInt();
		int col = Utility.getInt();
		
		int [][] array = new int[row][col];
		int [][] multipliy = new int [row][col];
		
		
		System.out.println("Enter element for matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			 array[i][j] = Utility.getInt();
			}
			System.out.println();
		}
	
	System.out.println("Matrix is given below:");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			System.out.print(array[i][j]+"\t");
		}
		System.out.println();
	}
		
	 for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			for(int k=0;k<col;k++) {
				
		     int store =array[0][1] *array[1][1] - array[1][0]*array[0][1];	
		
		System.out.print("print the :"+store);
			}
		}
	}
		
}
}