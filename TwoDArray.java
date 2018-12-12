package com.bridgelabz.stringarray;

import com.utility.Utility;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Enter 1 for Interger array:");
		System.out.println("Enter 2 for double array:");
		System.out.println("Enter 3 for boolean arrray:");
	//	int number = Utility.getInt();
		System.out.println("Enter a choice do you want :");
		int choice = Utility.getInt();
		
		Utility.print2DArray(choice);
		
		}

	}

