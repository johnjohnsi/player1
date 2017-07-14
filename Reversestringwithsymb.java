package guvi;
import java.util.*;
public class Reversestringwithsymb {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the String : " );
		String str = s.nextLine();
		for( int i = str.length()-1 ; i > 0 ; i-- ) {
			System.out.print( str.charAt( i ) );
			System.out.print( "-" );
		}
		System.out.print( str.charAt( 0 ) );
		s.close();
	}
}
