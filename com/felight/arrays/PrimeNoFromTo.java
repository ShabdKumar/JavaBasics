package com.felight.arrays;

public class PrimeNoFromTo {

	public static void main(String[] args) {
		int from=100, to=200;
		int[] array = new int[30];
		int a=0, i, j;
		
		for (i=from; i<=to; i++) {
			
			for(j=2; j<i; j++) {
				if(i%j == 0)
					break;
			
			}
			
			if(i==j) {
				array[a]=i;
				a++;
			
			}
		
		}
		
		for(i=0; array[i]!=0; i++) {
			System.out.print(array[i]+" ");
		
		}
		
	}

}
