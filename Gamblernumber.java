package com.bridgelabz.stringarray;

import com.utility.Utility;

public class Gamblernumber {

	public static void main(String[] args) {

		System.out.println("Enter the stake :");
		int stake = Utility.getInt();
		
		System.out.println("Enter the goal value:");
		int goal = Utility.getInt();
		
		System.out.println("Enter the number of trails:");
		 int trails = Utility.getInt();
		 
		 Utility.gambler(trails, stake, goal);
		 
	}

}
