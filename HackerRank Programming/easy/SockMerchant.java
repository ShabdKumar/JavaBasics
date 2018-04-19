package easy;

import java.util.Scanner;

public class SockMerchant {
	static int sockMerchant(int n, int[] ar) {
		int[] freq = new int[ar.length];
		for(int i=0; i<freq.length; i++) {
			freq[i] = -1;
		}
		
		int count;
		for(int i=0; i<ar.length; i++) {
			count = 1;
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i] == ar[j]) {
					count++;
					freq[j] = 0;
				}
			}
			if(freq[i] != 0) {
				freq[i] = count;
			}
		}
		
		int sum = 0;
		for(int i=0; i<ar.length; i++) {
			if(freq[i] > 1) {
				sum = sum + freq[i]/2;
			}
		}
		return sum;
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
