package guvi;
import java.util.*;
public class DoubleString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input : " );
		String input = s.nextLine();
		String firstHalfString = input.substring( 0 , input.length()/2);
		String secondHalfString = input.substring( input.length()/2 , input.length() );
		if( firstHalfString .equals( secondHalfString ) ) {
			System.out.println( "The given string is double string " );
		}
		else {
			System.out.println( "The given string is not double string " );
		}
		s.close();
	}
}
