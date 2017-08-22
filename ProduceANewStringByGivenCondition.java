package guvi;
import java.util.*;
public class ProduceANewStringByGivenCondition {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		for( int i = 0 ; i < input.length() ; i++ ) {
			if( i % 2 == 0 ) {
				System.out.print( input.charAt(i) );
			}
		}
		System.out.print( " " );
		for( int i = 0 ; i < input.length() ; i++ ) {
			if( i % 2 != 0 ) {
				System.out.print( input.charAt(i) );
			}
		}
		s.close();
	}
}
