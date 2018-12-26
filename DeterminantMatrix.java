package com.bridgelabz.stringarray;

import java.util.Scanner;

import com.utility.Utility;

public class DeterminantMatrix {
	
	
	public static void main(String[] args) 
	{   Scanner scan =new Scanner(System.in);
		System.out.println("Enter number of row and columns of matrix:");
		int r = scan.nextInt();
		int c = scan.nextInt();
		int matrix[][] = new int[r][c];
		Utility.inputOfIntMatrix(matrix, r, c);
		Utility.printIntMatrix(matrix, r, c);
        //int det1=(mat[][]((mat[][])- (mat[][])));
}
	
}

