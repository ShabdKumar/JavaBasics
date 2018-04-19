package string;

import java.util.Scanner;

public class IsAnagram {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String str1 = in.nextLine();
		System.out.println("Enter 2nd String : ");
		String str2 = in.nextLine();
		boolean result=false;
		
		if(str1.length() == str2.length()) {
			result = true;
			for(int i=0; i<str1.length(); i++) {
				if(count(str1.charAt(i), str1) != count(str1.charAt(i), str2)) {
					result = false;
				}
			}
		}
		System.out.println(result);

	}

	private static int count(char ch, String string) {
		int count=0;
		for(int i=0; i<string.length(); i++) {
			if(ch == string.charAt(i)) {
				count++;
			}
		}
		return count;
	}

}
