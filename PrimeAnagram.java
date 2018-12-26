package com.bridgelabz.stringarray;

import com.utility.Utility;

public class PrimeAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prime numbers in range 1-1000");
		int [] primeAnagram = Utility.primeAnagrams(1000);

		int[][] printArray = Utility.twoDPrimeArray(primeAnagram);
		Utility.printPrimeArray(printArray);
		
		
		
	}
	}


