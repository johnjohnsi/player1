package guvi;
import java.util.*;
public class ArrayRotateIsByGivenKValue {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int array[] = new int[size];
		for( int i = 0 ; i < size ; i++ ) {
			array[i] = s.nextInt();
		}
		int targetNumber = s.nextInt();
		for( int i = targetNumber + 1 ; i < array.length ; i++ ) {
			System.out.print( array[i] );
		}
		for( int i = 0 ; i < targetNumber ; i++ ) {
			System.out.print( array[i] );
		}
		System.out.print( array[targetNumber] );
		s.close();
	}
}
