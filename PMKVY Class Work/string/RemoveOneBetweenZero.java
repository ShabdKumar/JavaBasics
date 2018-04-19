package string;

import java.util.Scanner;

public class RemoveOneBetweenZero {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = in.nextLine();
		String result = removeOneBetweenZero(str);
		System.out.println(result);

	}

	static String removeOneBetweenZero(String str) {
		String result = ""+str.charAt(0);
		for(int i=1; i<str.length()-1; i++) {
			boolean flag = true;
			if(str.charAt(i) == '1') {
				if((str.charAt(i-1)=='0') && (str.charAt(i+1)=='0')) {
					flag = false;
				}
			}
			if(flag) {
				result = result + str.charAt(i);
			}
		}
		result = result + str.charAt(str.length()-1);
		return result;
	}

}
