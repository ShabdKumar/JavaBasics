package easy;

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {

	static int pickingNumbers(int[] a) {
		
		Arrays.sort(a);
        
        int[] freq = new int[a.length];
        int count;
        for(int i=0; i<freq.length; i++) {
        	freq[i] = -1;
        }
        for(int i=0; i<a.length; i++) {
        	count = 1;
        	for(int j=i+1; j<a.length; j++) {
        		if(a[i] == a[j]) {
        			count++;
        			freq[j] = 0;
        		}
        	}
        	if(freq[i] != 0) {
        		freq[i] = count;
        	}
        }
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
