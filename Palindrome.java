package com.bridgelabz.stringarray;

import com.utility.Utility;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number to to check palindrome :");
		int num = Utility.getInt();
		
		int temp = num;
		int sum = 0;
		int rem ;
		
		while(num > 0) {
			rem = num % 10;
			sum = (sum*10)+rem;
			num = num /10;
   		}
	 if(temp == sum) {
		 System.out.println("is palindrome :");
	 } else {
		 System.out.println("Not a ");
	 }

	}
}
