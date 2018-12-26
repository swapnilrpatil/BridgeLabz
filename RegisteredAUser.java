/**
 * @purpose : Program for to print the user informtion with regex
 * 
 * @author  : swapnil patil
 * 
 * @since  : 13/12/2018
 * 
 * @version : java jdk
 */

package com.bridgelabz.stringarray;

import com.utility.Utility;

public class RegisteredAUser {
	public static void main(String[] args) {
		
       String firstName = "";
		String lastName  = "";
		String  emailId  = "";
		String  phoneNumber = "**********";
		String userName = "";
		String passWord = "<<********>>";
		
		boolean validation= false;
		System.out.println("Enter first name of user:");
		
		 while(validation !=true) {
			  firstName = Utility.getString();
			 validation = Utility.stringValidation(firstName);
				if(validation == false)
				{
					System.out.println("Enter correct name");
				}
			}
		validation = false;
		System.out.println("Enter last name");
			while(validation != true)
			{
			 lastName =Utility.getString();
				validation = Utility.stringValidation(lastName);
				if(validation == false)
				{
					System.out.println("please Enter correct Lastname");
				}
			}
			validation = false;
			System.out.println("Enter user phone number");
			while(validation != true)
			{
				 phoneNumber = Utility.getString();
				validation = Utility.contactValidation(phoneNumber);
				if(validation == false)
				{
					System.out.println("please Enter correct phone number");
				}
			}
			validation = false;
			System.out.println("Enter email id:");
			while(validation != true)
			{
				 emailId = Utility.getString();
				validation = Utility.emailidValidation(emailId);
				if(validation == false)
				{
					System.out.println("Enter correct email id");
				}
			}
			validation = false;
			System.out.println("Enter UserId");
			System.out.println("Must Ensure User Id has no special characters ");
			while(validation != true)
			{
				 userName =  Utility.getString();
				validation = Utility.uIdValidation(userName);
				if(validation == false)
				{
					System.out.println("please Enter correct UserId");
				}
			}

			validation = false;
			System.out.println("Enter your password:");
			System.out.println(" Password is min 8 Chars with at least one Uppercase, has\n" + 
					           "exactly one special character and has at least one numeric number in password.\n"+ 
					            "Also ensure the password does not have first name, last name, user name or\n"+ 
					             "company name.");
			while(validation != true)
			{
				passWord = Utility.getString();
				validation = Utility.passwordValidation(passWord,firstName, lastName,userName);
				if(validation == false)
				{
					System.out.println("please Enter correct Password");
				}
			}
			
			System.out.println("User Details is as follows:");
			System.out.println("First name    = "+firstName);
			System.out.println("Last name     = "+lastName);
			System.out.println("Email Address = "+emailId);
			System.out.println("Phone Number  = "+phoneNumber);
			System.out.println("User id       = "+userName);
			System.out.println("User Password = "+passWord);  
		
	}	
}
	
	

