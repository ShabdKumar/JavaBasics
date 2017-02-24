package com.felight.arrays;

public class EvenNoFromTo {

	public static void main(String[] args) {
		int from=100, to=200;
		int range=((to-from)/2) + 1;
		int[] array = new int[range];
		int a=0;
		
		for (int i=from; i<=to; i++) {
			if(i%2==0) {
				array[a]=i;
				a++;
			
			}
			
		}
		
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");

	}

}
