package guvi;
import java.util.*;
public class EmailVerify {
	public static void main(String [] args ) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input : " );
		String input = s.next();
		String inputDemo = input;
		int position = 0;
		int count = 0;
		for( int i = 0 ; i < input.length() ; i++ ) {
			if( input.charAt(i) == '@' ) {
				position = i;
				count++;
			}
		}
		int position2 = 0;
		int count2 = 0;
		String subStringFront = input.substring( 0 , position );
		@SuppressWarnings("unused")
		String subStringBack = input.substring( position + 1 , input.length() );
		for( int i = 0 ; i < inputDemo.length() ; i++ ) {
			if( inputDemo.charAt(i) == '.') {
				position2 = i;
				count2++;	
			}
		}
		String backHalf = input.substring( position + 1 , position2 );
		String finalHalf = input.substring( position2 + 1 , input.length() );
		if( ( subStringFront.length() >= 3 ) && ( count == 1 ) && ( count2 ==1 ) && ( backHalf.length() == 5) && ( finalHalf.contains( "com" ) ) ) {
			System.out.println( "Valid Input" );
		}
		else {
			System.out.println( "Invalid Input" );
		}
		s.close();
	}
}
