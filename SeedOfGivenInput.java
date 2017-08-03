package guvi;
import java.util.*;
public class SeedOfGivenInput {
	public static void main( String[] args ) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		int input1 = s.nextInt();
		System.out.println( "Enter the Input2 : " );
		int input2 = s.nextInt();
		int tempInput1 = input1;
		int rem = 0;
		int mul = 1;
		while( tempInput1 != 0 ) {
			rem = tempInput1 % 10;
			mul *= rem;
			tempInput1 /= 10;
		}
		if( input1 * mul == input2 ) {
			System.out.println( input1 + " is a seed of " + input2 );
		}
		else {
			System.out.println( input1 + " is not a seed of " + input2 );
		}
		s.close();
	}
}
