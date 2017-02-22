package com.felight.method;

public class PrimeNumbersToFrom {
	
	public static boolean isPrime(int num) {
		int i;
		
		for(i=2; i<num; i++) {
			if(num%i == 0)
				break;
		
		}
		return (i==num);
	
	}
	
	public static String generatePrime(int num1, int num2) {
		int i;
		String result = "";
		
		for(i=num1; i<=num2; i++) {
			if(isPrime(i))
				result+=" "+i;
		
		}
		return result;
	
	}
	
	public static void main(String[] args) {
		System.out.print(generatePrime(100, 200));
	
	}

}
