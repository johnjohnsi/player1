package guvi;
import java.util.*;
public class Asciiavgstr {
	public static void main( String [] args ) {
		Scanner s = new Scanner( System.in );
		System.out.println( " Enter the String : " );
		String str = s.nextLine();
		int num = 0;
		int out = 0;
		for( int  i = 0 ; i<str.length() ; i++ ) {	
			num =( int )( str.charAt ( i ) );
			out += num;
			}
	
		System.out.println( ( char )( out/str.length() ) );
		s.close();
	}

}
