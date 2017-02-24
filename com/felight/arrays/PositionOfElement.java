package com.felight.arrays;

public class PositionOfElement {
	
	public static int position(int element) {
		int pos = 0;
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		for(int i=0; i<array.length; i++) {
			if (element==array[i])
				pos = i+1;
		
		}
		
		if (pos!=0)
			return pos;
		else 
			return (-1);
	
	}
	
	public static void main(String[] args) {
		System.out.println(position(10));
	
	}

}
