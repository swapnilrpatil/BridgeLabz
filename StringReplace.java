package com.bridgelabz.stringarray;

import java.util.Scanner;

import com.utility.Utility;

public class StringReplace {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		String str = "Old MacDonald had A farm\n"+"E -I -E -I-o\n"+"And on his farm he had some %ANIMAL%\n"
					  +"With A %SOUND% %SOUND% here\n"
					  +"And a %SOUND% %SOUND% there\n"
					  +"here a %SOUND% , there a %SOUND%\n"
					  +"Everywhere a %SOUND% %SOUND%.";

		String reAnimal = "%ANIMAL%";
		String reSound = "%SOUND%";
	 
		 System.out.println("Enter animal to replace:");
		 String animal = scanner.nextLine();
		 
		 System.out.println("Enter Sound to replace");
		 String sound = scanner.nextLine();
		 
		 Utility utility = new Utility();
		 str = Utility.replacementregex(str, reAnimal, animal);
		 str = Utility.replacementregex(str, reSound, sound);
		 System.out.println(""+str);
		 
		 
		 
		 
}
}