package com.felight.arrays;

public class NaturalNoArray {

	public static void main(String[] args) {
		int[] array = new int[20];
		
		for(int i=0; i<array.length; i++)
			array[i] = i+1;
		
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);

	}

}
