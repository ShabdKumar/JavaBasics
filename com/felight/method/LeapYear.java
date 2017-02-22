package com.felight.method;

public class LeapYear {
	
	public static boolean isLeap(int year) {
		return (((year%100 != 0) && (year%4 == 0)) || (year%400 == 0));
	
	}
	
	public static void main(String[] args){
		System.out.print(isLeap(1992));
	
	}

}
