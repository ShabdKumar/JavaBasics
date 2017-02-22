package com.felight.loop;

public class Prime {

	public static void main(String[] args) {
		int i, num = 31;
		
		for(i=2; i<num; i++){
			if(num%i == 0)
				break;
		
		}
		if(i == num)
			System.out.print("true");
		else
			System.out.print("false");

	}

}
