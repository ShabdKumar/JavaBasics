package string;

import java.util.Scanner;

public class NumberContainingDigit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = in.nextInt();
		System.out.println("Enter the digit : ");
		int digit = in.nextInt();
		printNumberContainingDigit(num, digit);
	}

	static void printNumberContainingDigit(int num, int digit) {
		String str = "";
		String digitSequence = ""+digit;
		for(int i=1; i<num; i++) {
			str = ""+i;
			if(str.contains(digitSequence)) {
				System.out.print(i+" ");
			}
		}
		
	}

}
