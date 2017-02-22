package com.felight.method;

public class PalindromeNo {
	
	public static boolean isPalindrome(int num) {
		int remain, reverse=0, temp=num;
		
		while(num>0) {
			remain = num%10;
			reverse = (reverse*10)+remain;
			num = num/10;
		
		}
		return (temp==reverse);
	
	}
	
	public static void main(String[] args){
		System.out.print(isPalindrome(122));
	}

}
