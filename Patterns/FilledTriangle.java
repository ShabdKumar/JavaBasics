package pattern;

import java.util.Scanner;

public class FilledTriangle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Line : ");
		int line = in.nextInt();
		for(int i=0; i<line; i++) {
			for(int j=line-i; j>1; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i*2)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
