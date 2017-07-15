package guvi;
import java.util.*;
public class Stringcmopwihout {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the String1 : " );
		String str = s.nextLine();
		System.out.println( "Enter teh String2 : " );
		String str1 = s.nextLine();
		if( str.equalsIgnoreCase( str1 ) ) {
			System.out.println( "True" );
		}
		else {
			System.out.println( "False" );
		}
		s.close();
	}
}
