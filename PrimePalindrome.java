package com.bridgelabz.stringarray;

import com.utility.Utility;

public class PrimePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=1000;i++)
		{
			if(Utility.findprimenumber(i) && Utility.isPallindrome(i))
			{
				System.out.println(i+"  ");
			}
		}
	}

}
