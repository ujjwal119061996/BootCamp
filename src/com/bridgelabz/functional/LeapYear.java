/******************************************************************************
 *  
 *  Purpose: Find a Leap Year.
 *
 *  @author  Navin
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;
import java.util.*;

import com.Utility.utility;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		utility utility=new utility();
		System.out.println("Enter the Year :");
		int year=scanner.nextInt();
		utility.getLeapYear(year);
		
		scanner.close();
	}
}
