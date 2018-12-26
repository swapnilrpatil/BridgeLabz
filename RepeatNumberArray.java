package com.bridgelabz.stringarray;

import com.utility.Utility;

public class RepeatNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number for the array size");
		 int number = Utility.getInt();
		 
		 int [] array = new int[number];
		 for(int i=0;i<number;i++) {
			 array[i] = Utility.getInt();
		 }
		 
		 int result = Utility.isrepeatNumber(array);
		System.out.println("print the finally result:"+result);

	}

}
