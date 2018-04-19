package easy;

import java.util.Scanner;

public class DrawingBook {
	
	static int solve(int n, int p){
        
		int countFromStart = p/2;
		int countFromLast = 0;
		
		if(n%2 == 0) {
			countFromLast = (n-p+1)/2;
		}
		else {
			countFromLast = (n-p)/2;
		}
		
		return countFromStart>countFromLast?countFromLast:countFromStart;
	}

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
