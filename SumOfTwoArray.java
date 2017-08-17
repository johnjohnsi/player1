package guvi;
import java.util.*;
public class SumOfTwoArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int array1[] = new int[size];
		for( int i = 0 ; i < size ; i++ ) {
			array1[i] = s.nextInt();
		}
		int array2[] = new int[size];
		for( int i = 0 ; i < size ; i++ ) {
			array2[i] = s.nextInt();
		}
		for( int i = 0 ; i < size ; i++ ) {
			array1[i] += array2[i];
			System.out.println( array1[i] );
		}
		s.close();
	}
}
