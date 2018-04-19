package string;

import java.util.Scanner;

public class CountingPairInString {
	
	static boolean isPair(String str) {
		if(str.charAt(0)==str.charAt(2))
			return true;			
		else
			return false;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String string = in.nextLine();
		
		int count = 0;
		
		for(int i=0; i<(string.length()-2); i++) {
			if(isPair(string.substring(i, i+3)))
				count++;
		}
		System.out.println(count);

	}

}
