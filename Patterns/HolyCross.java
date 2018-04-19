package pattern;

public class HolyCross {

	public static void main(String[] args) {
		char[][] A = new char[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if((i==2)||(j==2)) {
					A[i][j]='*';
				} else 
					A[i][j]=' ';
				
				System.out.print(A[i][j]);
			}
			System.out.println();
		}
		

	}

}
