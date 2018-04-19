package com.naukri;

import java.util.Scanner;

public class CountingSameElementsInCompounds {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The no. of Compound : ");
		int n = in.nextInt();
		in.nextLine();
		String[] string = new String[n];
		int count, count1 = 0;
		String str = "";
		
		System.out.println("Enter the "+n+" compounds : ");
		for(int i=0; i<n; i++)
			string[i] = in.nextLine();
		
		//removing duplicate character
		for(int i=0; i<string[0].length(); i++) {
			int count2 = 0;
						
			for(int j=0; j<=i; j++) {
				if(string[0].charAt(i) == string[0].charAt(j)) {
					count2++;
				}
			}
			
			if(count2 == 1) {
				str = ""+str+string[0].charAt(i);
			}
		}
		string[0] = str;
		
		//counting same element
		for(int i=0; i<string[0].length(); i++) {
			count = 1;
			for(int j=1; j<string.length; j++) {
				for(int k=0; k<string[j].length(); k++) {
					if(string[0].charAt(i) == string[j].charAt(k)) {
						count++;
						break;
					}
				}
			}
			if(count == n)
				count1++;
		}
		System.out.println(count1);
	}
}
