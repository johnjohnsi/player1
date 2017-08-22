package guvi;
import java.util.*;
public class PerfectNumberOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		int number = input;
		int sum = 0;
		for( int i = 1 ; i < number ; i++ ) {
			if( number % i == 0 ) {
				sum += i;
			}
		}
		if( sum == input ) {
			System.out.println( "The given number is a perfect number " );
		}
		else {
			System.out.println( "The given number is not perfect number " );
		}
		s.close();
	}
}
