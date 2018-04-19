package string;

import java.util.Scanner;

public class RemovingTag {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Paragraph : ");
		String str = in.nextLine();
		
		String result = removeTag(str);
		System.out.println(result);
	}

	private static String removeTag(String str) {
		boolean flag = true;
		String s = "";
		for(int i=0; i<str.length(); i++) {
			if((flag==true) && (str.charAt(i)=='<')) {
				flag = false;
			}
			else if((flag==false) && (str.charAt(i)=='>')) {
				flag = true;
			}
			else if((flag==true) && (str.charAt(i)!='<')) {
				s = s+str.charAt(i);
			}
		}
		return s;
	}

}
