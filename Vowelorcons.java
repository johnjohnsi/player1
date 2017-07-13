package guvi;
import java.util.*;
public class Vowelorcons {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Character : " );
		char ch = s.next().charAt(0);
		if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
			System.out.println( "The given Character is Vowel" );
		}
		else {
			System.out.println( "The given Character is Consonant" );
		}
		s.close();
	}

}
