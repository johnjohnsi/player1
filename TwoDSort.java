package guvi;
import java.util.Scanner;
public class TwoDSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Size : " );
		int size = s.nextInt();
		int array[][] = new int[size][size];
		for( int i = 0 ; i < size ; i++ ) {
			for( int j = 0 ; j < size ; j++ ) {
				array[i][j] = s.nextInt();
			}
		}
		int temp;
		for( int i =0 ; i < size ; i++ ) {
			for( int j = 0 ; j < size ; j++ ) {
				for( int k = 0 ; k < size ; k++ ) {
					for( int z = 0 ; z <size ; z++ ) {
						temp = 0;
						if( array[i][j] < array[k][z]) {
							temp = array[i][j];
							array[i][j] = array[k][z];
							array[k][z]= temp;
						}
					}
				}
			}
		}
		for( int i = 0 ; i <size ; i++ ) {
			for( int j = 0 ; j < size ; j++ ) {
				System.out.print( array[i][j] + " " );
			}
			System.out.println();
		}
		s.close();
	}
}
