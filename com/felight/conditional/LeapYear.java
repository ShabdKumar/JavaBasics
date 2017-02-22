package com.felight.conditional;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2015;
		
		if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0))
			System.out.print("true");
		else
			System.out.print("false");

	}

}
