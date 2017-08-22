package guvi;
import java.util.*;
public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int array[][] = new int[size][size];
		for( int i = 0 ; i < size ; i++ ) {
			for( int j =0 ; j < size ; j++ ) {
				array[i][j] = s.nextInt();
			}
		}
		for( int i = 0 ; i < size ; i++ ) {
			for( int j = 0 ; j < size ; j++ ) {
				System.out.print( array[j][i] + " " );
			}
			System.out.println();
		}
		s.close();
	}
}
