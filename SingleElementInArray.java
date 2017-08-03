package guvi;
import java.util.*;
public class SingleElementInArray {
	public static void main(String[]args) {
		Scanner s = new Scanner( System.in );
		System.out.println( "Enter the size of array : " );
		int size = s.nextInt();
		System.out.println( "Enter the array elements : " );
		int array[] = new int[size];
		for( int i = 0 ; i < size ; i++ ) {
			array[i] = s.nextInt();
		}
		int count = 0;
		System.out.println( "Single element in the array is : " );
		for( int i = 0 ; i < size ; i++ ) {
			for( int j = 0 ; j < size ; j++ ) {
				if( i != j ) {
				if( array[i] != array[j] ) {
					count = 1;
				}
				else {
					count = 0;
					break;
				}
			}
			}
			if( count == 1 ) {
				System.out.println( array [i] );
			}
		}
		s.close();
	}
}
