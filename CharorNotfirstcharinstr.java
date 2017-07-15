package guvi;
import java.util.*;
public class CharorNotfirstcharinstr {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the String : " );
		String str = s.nextLine();
		if( str.charAt( 0 ) >= '0' && str.charAt( 0)<='9' ) {
			System.out.println( "True" );
		}
		else {
			System.out.println( "False" );
		}
		s.close();
	}
}
