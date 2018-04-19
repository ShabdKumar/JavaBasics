package string;

import java.util.Scanner;

public class IsRotationOfString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st String :");
		String str1 = in.nextLine();
		System.out.println("Enter 2nd String :");
		String str2 = in.nextLine();
		boolean result = isRotationOfString(str1, str2);
		System.out.println(result);
	}

	static boolean isRotationOfString(String str1, String str2) {
		boolean result = false;
		
		if(str1.length() == str2.length()) {
			for(int j=0; j<str2.length(); j++) {
				if(str1.charAt(0) == str2.charAt(j)) {
					if(str1.substring(0, str2.length()-j).equals(str2.substring(j, str2.length())) 
							&& (str1.substring(str2.length()-j, str1.length()).equals(str2.substring(0, j)))) {
						result = true;
						break;
					}
				}
			}
		}
		return result;
	}

}
