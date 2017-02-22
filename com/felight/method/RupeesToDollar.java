package com.felight.method;

public class RupeesToDollar {
	
	public static double convert(double rupees) {
		return rupees/66.67;
	
	}
	
	public static void main(String[] args) {
		System.out.println(convert(1000.00));
	
	}

}
