/**@purpose  : Program to print 2D Array 
 * 
 * @author   : swapnil patil
 * 
 * @since    : 13/12/2018
 * 
 * @version  : java jdk
 */

package com.bridgelabz.stringarray;

import com.utility.Utility;

public class Print2Darray {

	
	public static void main(String[] args) 
	{
		//Utility utility=new Utility();
		int m=0;
		int n=100;
		String[][] array=new String[10][30];
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<30;j++)
			{
				array[i][j]=" ";
			}
		}
		
		int columnIndex=0;
		for(int rowIndex=0;rowIndex<10;rowIndex++)
		{
			for(int i=m;i<=n;i++)
			{
				if(Utility.findprimenumber(i))
				{
					array[rowIndex][columnIndex++]=i+"";
				}				
			}
			if(m<=900 && n<=1000)
			{
				m=m+100;
				n=n+100;
				columnIndex=0;
			}
		}
		Utility.print2DArrayElement(array);
	}
	
}

