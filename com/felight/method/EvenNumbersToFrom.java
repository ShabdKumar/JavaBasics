package com.felight.method;

public class EvenNumbersToFrom {
	
	public static boolean isEven(int num) {
		return (num%2 == 0);
	
	}
	
	public static String generateEven(int num1, int num2) {
		int i;
		String result = "";
		
		for(i=num1; i<=num2; i++) {
			if(isEven(i))
				result+= " "+i;
		
		}
		return result;
	
	}
	
	public static void main(String[] args) {
		System.out.print(generateEven(100, 200));
	
	}

}
