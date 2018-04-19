package easy;

import java.util.Scanner;

public class BonAppetit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		int b = in.nextInt();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			if(i != k) {
				sum = sum + arr[i];
			}
		}
		
		if(sum/2 == b) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b-sum/2);
		}

	}

}
