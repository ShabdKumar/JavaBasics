package com.felight.loop;

public class PrimeToFrom {

	public static void main(String[] args) {
		int i, j;
		
		for(j=100; j<=200; j++){
			for(i=2; i<j; i++){
				if(j%i == 0)
					break;
			
			}
			if(i == j)
				System.out.print(i+"\t");
		
		}

	}

}
