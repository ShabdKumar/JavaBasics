package arrays;

import java.util.Scanner;

public class TwoDimensionalArrayBasic {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter element to array : ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
