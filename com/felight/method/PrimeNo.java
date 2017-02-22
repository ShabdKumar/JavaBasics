package com.felight.method;

public class PrimeNo {
	
	public static boolean isPrime(int num) {
		int i;
		
		for(i=2; i<num; i++) {
			if(num%i == 0)
				break;
		
		}
		return (i==num);
	
	}
	
	public static void main(String[] args) {
		System.out.print(isPrime(17));
	
	}

}
