/******************************************************************************
 *  
 *  Purpose: perform various operator using integer datatype .
 *
 *  @author  Navin
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.*;

import com.Utility.utility;
public class IntOpt {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		utility utility=new utility();
		System.out.println("Enter the Integer a :");
		int a=scanner.nextInt();
		
		System.out.println("Enter the input b :");
		int b=scanner.nextInt();
		
		System.out.println("Enter the input c :");
		int c=scanner.nextInt();
		utility.getIntOpt(a, b, c);
		scanner.close();
	}

}
