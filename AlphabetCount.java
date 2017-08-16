package guvi;
import java.util.*;
public class AlphabetCount {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int count = 0;
		for( int i = 0 ; i < input.length() ; i++ ) {
			if( Character.isAlphabetic( input.charAt(i))) {
				count++;
			}
		}
		System.out.println( count );
		s.close();
	}
}
