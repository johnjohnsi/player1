package guvi;
import java.util.*;
public class IncreasingOrderOfGivenInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		int demoNumber = input;
		int count = 0;
		int rem = 0;
		while( demoNumber != 0 ) {
			rem = demoNumber % 10;
			count++;
			demoNumber /= 10;
		}
		int array[] = new int[count];
		while( input != 0 ) {
			for( int i = 0 ; i < count ; i++ ) {
			rem = input % 10;
			array[i] = rem;
			input /= 10;
		}
		}
		Arrays.sort(array);
		for( int i = 0 ; i < count ; i++ ) {
			System.out.println( array[i] );
		}
		s.close();
	}
}
