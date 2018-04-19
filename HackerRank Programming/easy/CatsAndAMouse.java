package easy;

import java.util.Scanner;

public class CatsAndAMouse {
	
	static String catAndMouse(int x, int y, int z) {
		int distance1 = Math.abs(z-x);
		int distance2 = Math.abs(z-y);
		
		if(distance1<distance2)
			return "Cat A";
		else if(distance1>distance2)
			return "Cat B";
		else
			return "Mouse C";
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int term = in.nextInt();
		int[] x = new int[term];
		int[] y = new int[term];
		int[] z = new int[term];
		
		for(int i=0; i<term; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
			z[i] = in.nextInt();
		}
		
		for(int i=0; i<term; i++) {
			String result = catAndMouse(x[i], y[i], z[i]);
			System.out.println(result);
		}
	}
}
