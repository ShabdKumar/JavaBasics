package easy;

import java.util.Scanner;

public class AppleAndOrange {
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApple = 0;
        int countOrange = 0;
        for(int i=0; i<apples.length; i++) {
        	if((a+apples[i] >= s)&&(a+apples[i] <= t)) {
        		countApple++;
        	}
        }
        for(int i=0; i<oranges.length; i++) {
        	if((b+oranges[i] >= s)&&(b+oranges[i] <= t)) {
        		countOrange++;
        	}
        }
        System.out.println(countApple);
        System.out.println(countOrange);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
