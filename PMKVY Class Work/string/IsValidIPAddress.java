package string;

import java.util.Scanner;

public class IsValidIPAddress {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the ip Address : ");
		String ip = in.nextLine();
		int count = 0;
		
		String[] ipParts = ip.split("\\.");
		for(String str : ipParts) {
			int a = -1;
			count++;
			
			try {
				a = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				System.out.println("Not a Valid IP Address.");
				System.exit(0);
			}
			
			if(a<0 || a>255) {
				System.out.println("Not a Valid IP Address.");
				return;
			}
		}
		if(count == 4) {
			System.out.println("Its a VAlid IP Address.");
		}
		else {
			System.out.println("Not a Valid IP Address.");
		}
	}

}
