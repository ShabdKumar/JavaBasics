package com.felight.arrays;

public class CalculatorTest {

	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		Calculator.printArray(array);
		System.out.println("\n"+Calculator.sumArray(array));
		System.out.println(Calculator.maxOfArray(array));
		
		for (int num : Calculator.generateNaturalNumber(60))
			System.out.print(num+" ");
		System.out.println();
		
		for (int num : Calculator.generateRandomNumber(60))
			System.out.print(num+" ");
		System.out.println();
		
		for (int num : Calculator.generateEven(100,200))
			System.out.print(num+" ");

	}

}
