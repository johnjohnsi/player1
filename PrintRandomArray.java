package guvi;
import java.util.*;
public class PrintRandomArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int array1[] = new int[size];
		int array2[] = new int[size];
		for( int i = 0 ; i < size ; i++ ) {
			array1[i] = s.nextInt();
		}
		for( int i = 0 ; i < size ; i++ ) {
			array2[i] = s.nextInt();
		}
		int count = 0;
		for( int i = 0 ; i < size ; i++ ) {
			for( int j = 0 ; j < size ; j++ ) {
			if( array1[i] == array2[j]) {
					System.out.println(array1[i]);
				}
			else{
				count++;
			}
			}
		}
		if( count == size*size ) {
			System.out.println( "-1" );
		}
		s.close();
	}
}
