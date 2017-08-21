package guvi;
import java.util.*;
public class SumOfArrayEqulaToTargetNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int array[] = new int[size];
		for( int i = 0 ; i < size ; i++ ) {
			array[i] = s.nextInt();
		}
		int targetNumber = s.nextInt();
		for( int i = 0 ; i < size ; i++ ) {
			for( int j = i + 1 ; j < size ; j++ ) {
				if( array[i] + array[j] == targetNumber ) {
					System.out.println( array[i] + " " + array[j] );
				}
			}
		}
		s.close();
	}
}
