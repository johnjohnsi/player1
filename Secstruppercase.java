package guvi;
import java.util.*;
public class Secstruppercase {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		String str = s.nextLine();
		if( str.length() >= 2 ) {
		System.out.println( str.substring( 0 , 1 ) + str.substring( 1 , 2 ).toUpperCase() + str.substring( 2 , str.length() ) );
		}
		else {
			System.out.println( str );
		}
		s.close();
	}
}
