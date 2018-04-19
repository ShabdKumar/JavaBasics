package string;

import java.util.Scanner;

public class HeronFormula {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the sides of Triangle : \n");
		double side1 = in.nextDouble();
		double side2 = in.nextDouble();
		double side3 = in.nextDouble();
		double s = (side1 + side2 + side3)/2.0;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println(area);
	}

}
