package guvi;
import java.util.*;
public class PrintNUMinWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		int number = s.nextInt();
		String str = Integer.toString(number);
		for( int i = 0 ; i < str.length(); i++ ) {
		switch(str.charAt(i)) {
		case '1' : 
			System.out.print( "One" );
			break;
		case '2' : 
			System.out.print( "Two" );
			break;
		case '3' : 
			System.out.print( "Three" );
			break;
		case '4' : 
			System.out.print( "Four" );
			break;
		case '5' : 
			System.out.print( "Five" );
			break;
		case '6' : 
			System.out.print( "Six" );
			break;
		case '7' : 
			System.out.print( "Seven" );
			break;
		case '8' : 
			System.out.print( "Eight" );
			break;
		case '9' : 
			System.out.print( "Nine" );
			break;
		default :
			System.out.println( "Invalid Input" );
		}
		}
		s.close();
	}
}
