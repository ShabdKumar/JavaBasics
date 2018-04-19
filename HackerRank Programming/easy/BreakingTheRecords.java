package easy;

import java.io.IOException;
import java.util.Scanner;

public class BreakingTheRecords {

	static int[] breakingRecords(int[] score) {
        		
        int min = score[0];
        int max = score[0];
        int[] count = new int[2];
        count[0] = 0;
        count[1] = 0;
        
        for(int i=1; i<score.length; i++) {
        	if(min>score[i]) {
        		min = score[i];
        		count[1]++;
        	}
        	
        	if(max<score[i]) {
        		max = score[i];
        		count[0]++;
        	}
        }
        return count;

    }

    @SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
    	
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int[] score = new int[n];
    	
    	for(int i=0; i<n; i++) {
    		score[i] = in.nextInt();
    	}
    	
    	int[] result = breakingRecords(score);
    	
    	for(int i : result)
    		System.out.print(i+" ");
    }
    
}
