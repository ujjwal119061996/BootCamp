package com.bridgelabz.functional;
import java.util.*;


public class Reverse {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number of row:");
	 int n=sc.nextInt();
	 for(int row=1;row<=n;row++)
	 {
		 for(int k=1;k<=n-row;k++) {
			 System.out.print(" ");
		 }
		 for (int col=1;col<=(2*row)-1;col++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 sc.close();
}
}

