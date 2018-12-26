package com.bridgelabz.stringarray;

import java.util.Random;

import com.utility.Utility;

public class Birthdate { 

    public static void main(String[] args) { 
   
    	
      Random random = new Random();
    	
      Birthdate birthdDate = new Birthdate();
      
      double date = Math.random();
      
      
      
    	  
      }
    }


/*     int days   = Integer.parseInt(args[0]);    // number of days
int trials = Integer.parseInt(args[1]);    // number of trials
int people = 0;                            // total number of people over all trials

// repeat trials times
for (int t = 0; t < trials; t++) {

    //  hasBirthday[d] = true if someone born on day d; false otherwise
    boolean[] hasBirthday = new boolean[days];

    while (true) {
        people++;                               // one more person enters the room
        int d = (int) (days * Math.random());   // integer between 0 and days-1
        if (hasBirthday[d]) break;              // found two people with the same birthday
        hasBirthday[d] = true;                  // update array
    }
}

double average = (double) people / trials;
System.out.println("Average = " + average);*/