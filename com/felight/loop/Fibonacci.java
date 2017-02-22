package com.felight.loop;

public class Fibonacci {

	public static void main(String[] args) {
		int i, c;
		int a = 0, b = 1;
		int term = 10;
		
		for(i=0; i<term; i++) {
			if(i <= 1)
				c = i;
			
			else {
				c = a+b;
				a = b;
				b = c;
			
			}			
			System.out.print(c+" ");
		
		}

	}

}
