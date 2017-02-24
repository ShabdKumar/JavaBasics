package com.felight.arrays;

public class PalindromeFromTo {

	public static void main(String[] args) {
		int from=100, to=200;
		int[] array = new int[20];
		int a=0, i, j;
		int rem;
		
		for (i=from; i<=to; i++) {
			j = i;
			int rev = 0;
			
			while(j>0) {
				rem = j%10;
				rev = (rev*10)+rem;
				j = j/10;
			
			}
			
			if(rev==i) {
				array[a]=rev;
				a++;
			
			}
			
		}
		
		for(i=0; array[i]!=0; i++)
			System.out.print(array[i]+" ");

	}

}
