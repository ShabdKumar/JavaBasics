package com.felight.method;

public class FibonacciSeries {
	
	public static String generateFibonacci(int term) {
		int i, num1=0, num2=1, num3;
		String result = "";
		
		for(i=0; i<term; i++) {
			if(i<=1)
				num3 = i;
			
			else {
				num3 = num1+num2;
				num1 = num2;
				num2 = num3;
			
			}
			result+=" "+num3;
		
		}
		return result;
	
	}
	
	public static void main(String[] args) {
		System.out.print(generateFibonacci(30));
	
	}

}
