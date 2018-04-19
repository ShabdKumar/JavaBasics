package easy;

import java.util.Scanner;

public class MigratoryBirds {
	
	static int migratoryBirds(int n, int[] ar) {
        
		int[] freq = new int[ar.length];
        int count;
        
        for(int i=0; i<freq.length; i++) {
        	freq[i] = -1;
        }
        
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
        
        int max = freq[0];
        int index = 0;
        for(int i=0; i<freq.length; i++) {
        	if(max<freq[i]) {
        		max = freq[i];
        		index = i;
        	}
        }
        
        int minId = ar[index];
        for(int i=0; i<freq.length; i++) {
        	if(i != index) {
        		if(max == freq[i]) {
        			minId = ar[index]>ar[i]?ar[i]:ar[index];
        		}
        	}
        }
        return minId;
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
