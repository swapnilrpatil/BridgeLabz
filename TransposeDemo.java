package com.bridgelabz.stringarray;

import com.utility.Utility;

public class TransposeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
	  System.out.println("Enter the number for row :");
	  int row = Utility.getInt();
	  System.out.println("Enter the number for col:");
	  int col = Utility.getInt();
	  int[][] result = Utility.trasposDemo(row , col);
	  System.out.println("Above is a final result:");

}
}
