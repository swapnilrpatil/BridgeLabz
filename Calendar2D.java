package com.bridgelabz.stringarray;

import com.utility.Utility;

public class Calendar2D {

	public static void main(String[] args) {

		System.out.println("Enter the month :");
		int month = Utility.getInt();
		System.out.println("Enter the year :");
		int year = Utility.getInt();
		Utility.calender(month, year);
	}

}
