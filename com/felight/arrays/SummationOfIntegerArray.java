package com.felight.arrays;

public class SummationOfIntegerArray {
	
	public static int sumArr(int[] array) {
		int sum = 0;
		
		for(int num: array)
			sum+=num;
		return sum;
	
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(sumArr(arr));
	
	}

}
