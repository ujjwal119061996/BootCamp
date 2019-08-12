package com.bridgelabz.functional;

import com.Utility.*;
public class SumOfDice {

	public static void main(String[] args) {
		
		utility utility=new utility();
		
		int sum=utility.getRandom();
		if(sum<7)
		{
			System.out.print("The Sum of Dice is :" +sum);
		} 
		else
		{
			System.out.print("The sum of Dice is greater than 6");
		}
		
	}

}
