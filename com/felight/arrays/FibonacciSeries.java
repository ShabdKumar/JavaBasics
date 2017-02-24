package com.felight.arrays;

public class FibonacciSeries {

	public static void main(String[] args) {
		int[] array = new int[20];
		int a=0, b=1, c, i;
		
		for (i=0; i<array.length; i++) {
			if(i<=1)
				c = i;
			
			else {
				c = a + b;
				a = b;
				b = c;
			
			}
			array[i]=c;
		
		}
		
		for (i=0; i<array.length; i++)
			System.out.print(array[i]+" ");

	}

}
