/******************************************************************************
 *  
 *  Purpose: Find a  Spring Season.
 *
 *  @author  Navin
 *  @version 1.0
 *  @since   08-08-2019
 *
 ***********************************************************************
*/

package com.bridgelabz.functional;


import com.Utility.utility;


public class SpringSeason {

	public static void main(String[] args) {
		
		utility utility=new utility(); 
		int month=Integer.parseInt(args[0]);
		int day=Integer.parseInt(args[1]);
		System.out.println("The month :" +args[0]);
		System.out.println("The day :" +args[1]);
		if(utility.getSpringSeason(month,day))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
