package com.felight.arrays;

public class Calculator {
	
	//PRINTING AN ARRAY
		public static void printArray(int[] array) {
			for (int num : array)
				System.out.print(num+" ");
	
		}
	
	//SUMMATION OF INTEGER ARRAY.
		public static int sumArray(int[] array) {
			int sum = 0;
			
			for (int num : array)
				sum+=num;
			return sum;
		
		}
		
	//MAX OF ARRAY.
		public static int maxOfArray(int[] array) {
			int max = 0;
			
			for (int num : array) {
				if (num >= max)
					max = num;
		
			}
			return max;
	
		}
		
	//GENERATING NATURAL NUMBER.
		public static int[] generateNaturalNumber(int howMany) {
			int[] array = new int[howMany];
			
			for (int i=0; i<array.length; i++)
				array[i] = i+1;
			return array;
	
		}
		
	//GENERATING EVEN NUMBER BETWEEN FROM AND TO.
		public static boolean isEven(int num) {
			return num%2==0;
	
		}
		
		public static int[] generateEven(int from, int to) {
			int range = ((to-from)/2)+1;
			int[] array = new int[range];
			int j=0;
		
			for (int i=from; i<=to; i++) {
				if (isEven(i)) {
					array[j] = i;
					j++;
			
				}
				
			}
			return array;
	
		}
		
	//GENERATING RANDOM NUMBER.
		public static int[] generateRandomNumber(int howMany) {
			int[] array = new int[howMany];
		
			for (int i=0; i<array.length; i++)
				array[i]=(int)(Math.random()*1000);
			return array;
	
		}

}
