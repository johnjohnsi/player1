package guvi;
import java.util.*;
public class Basedlength {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		String str = s.nextLine();
		System.out.println( "Enter the Input2 : " );
		String str1 = s.nextLine();
		if( str.length() == str1.length() ) {
			System.out.println( str + str1 );
		}
		else {
			if( str.length()>str1.length() ) {
			System.out.println( str.substring( str.length()-2 ) + str1.substring( 0 ) );
			}
			else {
				System.out.println( str.substring(0) + str1.substring( str1.length() -2) );
			}
		}
		s.close();
	}
}
