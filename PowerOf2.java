/**@purpose  : Program to print the number in range of 2's power in tens hundread and thousand
 * 
 * @author   : swapnil patil
 * 
 * @since    : 13/12/2018
 * 
 * @version  : java jdk
 */
package com.bridgelabz.stringarray;

import java.util.Scanner;

import com.utility.Utility;


public class PowerOf2 {

	public static void main(String[] args) {

		System.out.println("enter number which is greater than 10");
		//Scanner scan = new Scanner(System.in);
	     int n = Utility.getInt();
	     int power =(int) Math.pow(2, n);
	     System.out.println("2^"+n+"="+power);
	    int  unit = power;
	    int ten = power;
	    int hundred = power;
	    int thousand = power;
		int mat[][] = new int[2][2];

	    while(10 < unit)          // take digit position as unit
	     {
	    	 unit = unit / 10;
	    	 
	     }
	     while( 100 < ten)        // take digit position as ten
	     {
	    	 ten = ten/10;
	    	
	     }
	     while(1000 < hundred)   // take digit position as hundred
	     {
	    	 hundred = hundred/10;
	     }
	     while(10000 < thousand) // take digit position as thousand
	     {
	    	thousand = thousand/10; 
	     }
	     
	    System.out.println("Unit of"+power+"="+unit);
	    System.out.println("ten of"+power+"="+ten);
	    System.out.println("hundred of"+power+"="+hundred);
	    System.out.println("thousand of"+power+"="+thousand);
	}

}



