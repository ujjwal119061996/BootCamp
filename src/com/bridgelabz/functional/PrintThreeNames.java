/****************************************************************************** 
 *  Purpose: Print 3 Names in reverse order .
 *
 *  @author  Navin
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************
*/


package com.bridgelabz.functional;
import java.util.*;
public class PrintThreeNames {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Names: ");
		String names=scanner.nextLine();		
		String[] sp=names.split(" ");
		System.out.print("Hi ");
		for(int i=sp.length-1;i>=1;i--)
		{
			System.out.print(sp[i]+ ",");
			
		}
		System.out.print("and "+sp[0]+ ".");
			scanner.close();
		
	}

}