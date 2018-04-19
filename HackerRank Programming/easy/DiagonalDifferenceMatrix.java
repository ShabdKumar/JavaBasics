package easy;
import java.util.*;

public class DiagonalDifferenceMatrix {

	static int diagonalDifference(int[][] a) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int row = a.length;
        int col = a[0].length;
        for(int i=0; i<row; i++) {
        	for(int j=0; j<col; j++) {
        		if(i==j)
        			primaryDiagonal = primaryDiagonal + a[i][j];
        	}
        }
        int j = col-1;
        for(int i=0; i<row; i++) {
        	secondaryDiagonal = secondaryDiagonal + a[i][j];
        	j--;
        }
        if(primaryDiagonal>=secondaryDiagonal)
        	return (primaryDiagonal-secondaryDiagonal);
        else
        	return (secondaryDiagonal - primaryDiagonal);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}