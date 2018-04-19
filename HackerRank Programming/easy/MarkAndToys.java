package easy;

import java.util.Scanner;

public class MarkAndToys {
	
	static int maximumToys(int[] prices, int k) {
        
		for(int i=0; i<prices.length; i++) {
        	for(int j=i+1; j<prices.length; j++) {
        		if(prices[i]>prices[j]) {
        			int temp = prices[i];
        			prices[i] = prices[j];
        			prices[j] = temp;
        		}
        	}
        }
		
        int sum = prices[0];
        int count = 0;
        for(int i=0; i<prices.length; i++) {
        	if(sum <= k) {
        		sum = sum + prices[i];
        		count++;
        	}
        	else
        		break;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] prices = new int[n];
        for(int prices_i = 0; prices_i < n; prices_i++){
            prices[prices_i] = in.nextInt();
        }
        int result = maximumToys(prices, k);
        System.out.println(result);
        in.close();
    }

}