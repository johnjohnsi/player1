package guvi;
import java.util.*;
public class VowelsAndConsonantInGivenString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		for( int i = 0 ; i < input.length() ; i++ ) {
			if( input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U' ) {
				System.out.print(input.charAt(i));
			}
		}
		System.out.print( " " );
		for( int i = 0 ; i < input.length() ; i++ ) {
			if( !( input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U' ) ) {
				System.out.print(input.charAt(i));
			}
		}
		s.close();
	}
}
