package easy;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {

	static int getTotalX(int[] a, int[] b) {
		int count = 0;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=a[a.length-1]; i<=b[0]; i++) {
			int count1 = 0;
			int count2 = 0;
			
			for(int j=0; j<a.length; j++) {
				if(i%a[j] == 0) {
					count1++;
				}
			}
			
			for(int j=0; j<b.length; j++) {
				if(b[j]%i == 0) {
					count2++;
				}
			}
			
			if((count1 == a.length)&&(count2 == b.length)) {
				count++;
			}
		}
		return count;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		
		for(int i=0; i<m; i++) {
			b[i] = in.nextInt();
		}
		
		int total = getTotalX(a, b);
		System.out.println(total);
	}
}
