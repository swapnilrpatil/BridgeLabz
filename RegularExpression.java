package com.bridgelabz.stringarray;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

import com.utility.Utility;

	public class RegularExpression {
		
		    public static void main(String[] args) {
		       
		        Scanner scanner = new Scanner(System.in);
		       
		        System.out.println("Full Name of user : ");
		       
		        String fname = scanner.nextLine();

		        String [] name = fname.split(" ");
		       
		        String fname1 = name[0]; // used for to take 1st name as a name
		       
		        System.out.println("Mobile Number: ");
		       
		        String mobnum = scanner.nextLine();
		     
		        Utility.regexExpression(fname , mobnum ,fname1);
		        
	}
	
	}

