package guvi;
import java.util.*;
public class CheckTargetNumber {
	public static void main(String[] rgas) {
		Scanner s = new Scanner( System.in );
		System.out.println( "Enter the Size of array : " );
		int size = s.nextInt();
		System.out.println( "Enter the array elements : " );
		int array [] = new int[size];
		for( int i = 0 ; i < size ; i++ ) {
			array[i] = s.nextInt();
		}
		System.out.println( "Enter the Target number : " );
		int targetNumber = s.nextInt();
		int sum = 0;
		for( int i = 0 ; i < size ; i++ ) {
			sum += array[i];
		}
		if( sum == targetNumber ) {
			System.out.println( "TRUE" );
		}
		else {
			System.out.println( "FALSE" );
		}
		s.close();
	}
}
