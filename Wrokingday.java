package guvi;
import java.util.*;
public class Wrokingday {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Days : " );
		String str = s.nextLine();
		if( str.equalsIgnoreCase( "Monday" )) {
			System.out.println( "True" );
		}
		else if( str.equalsIgnoreCase( "Tuesday" )) {
			System.out.println( "True" );
		}
		else if( str.equalsIgnoreCase( "Wednesday" )) {
			System.out.println( "True" );
		}
		else if( str.equalsIgnoreCase( "Thursday" )) {
			System.out.println( "True" );
		}
		else if( str.equalsIgnoreCase( "Friday" )) {
			System.out.println( "True" );
		}
		else if( str.equalsIgnoreCase( "Saturday" )) {
			System.out.println( "False" );
		}
		else if( str.equalsIgnoreCase( "Sunday" )) {
			System.out.println( "False" );
		}
		else {
			System.out.println( "Invalid Input!" );
		}
		s.close();
	}
}
