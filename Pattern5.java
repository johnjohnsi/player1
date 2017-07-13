package guvi;
import java.util.*;
public class Pattern5 {
	public static void main( String [] args ) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input : " );
		int num = s.nextInt();
		for( int i = 1 ; i<=num ; i++ ) {
			for( int j = 1 ; j<=num ; j++ ) {
			System.out.print( "*" );
			}
			System.out.println();
		}
		s.close();
	}

}
