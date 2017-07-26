package guvi;
import java.util.*;
public class Pymarid {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		int size = s.nextInt();
		for( int i = 0 ; i <= size ; i++ ) {
			for( int j = 0 ; j < size - i ; j++ ) {
				System.out.print( " " );
			}
			for( int k = 0 ; k < i ; k++ ) {
				System.out.print( "* " );
			}
			System.out.println();
		}
		s.close();
	}
}
