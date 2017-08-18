package guvi;
import java.util.*;
public class PatternProgramLine {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		for( int i = 1 ; i <= input ; i++ ) {
			for( int j =  1 ; j <= i ; j++ ) {
			System.out.print( j );
			}
			for( int k = i-1 ; k >= 1 ; k-- ) {
				System.out.print( k );
			}
			System.out.print( " " );
		}
		s.close();
	}
}
