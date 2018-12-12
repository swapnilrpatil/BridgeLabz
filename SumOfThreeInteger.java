package com.bridgelabz.stringarray;

import java.lang.reflect.Array;

import com.utility.Utility;

public class SumOfThreeInteger {

	public static void main(String[] args) {

		System.out.println("Enter a the size of array:");
		int size = Utility.getInt();
		
		System.out.println("Enter the element :");
		int [] array = new int[size];
		
		for(int i=0;i<size;i++) {
			array[i] = Utility.getInt();
		}
		
		Utility.printTriplet(array);
	}

}
