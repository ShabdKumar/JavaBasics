package com.felight.conditional;

public class Palindrome {

	public static void main(String[] args) {
		int num = 121, rem, rev = 0, temp;
		temp = num;
		
		while (num > 0) {
			rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
		
		}		
		if (rev == temp)
			System.out.print("true");
		else
			System.out.print("false");

	}

}
