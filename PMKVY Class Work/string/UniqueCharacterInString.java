package string;

import java.util.Scanner;

public class UniqueCharacterInString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String string = in.nextLine();
		String str = "";
		
		for(int i=0; i<string.length(); i++) {
			int count = 0;
						
			for(int j=0; j<=i; j++) {
				if(string.charAt(i) == string.charAt(j)) {
					count++;
				}
			}
			
			if(count == 1) {
				str = ""+str+string.charAt(i);
			}
		}
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

}
