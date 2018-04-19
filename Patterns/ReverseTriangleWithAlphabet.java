package pattern;

public class ReverseTriangleWithAlphabet {

	public static void main(String[] args) {
		int value=69;
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print((char)value);
			}
			System.out.println();
			value--;
		}

	}

}
