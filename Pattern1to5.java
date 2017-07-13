package guvi;
import java.util.*;
public class Pattern1to5 {
	public static void main( String[] args ) {
		Scanner s = new Scanner( System.in );
		System.out.println( "Enter the input : " );
		int num = s.nextInt();
		for( int  i = 0 ; i<num ; i++ ) {
			for( int j = 0 ; j<=i ; j++) {
				System.out.print( "*" );
			}
			System.out.println();
		}
		s.close();
	}

}
