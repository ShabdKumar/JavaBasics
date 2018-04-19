package string;

import java.util.Scanner;

public class CountingDigitInString {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String string = in.nextLine();
		
		int count = 0;
		
		for(int i=0; i<string.length(); i++) {
			if((string.charAt(i)>=48) && (string.charAt(i)<=57))
				count++;
		}
		
		System.out.println(count);
	}

}
