package guvi;
import java.util.*;
public class Anagramprgm {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		String str = s.nextLine();
		char ch [] = str.toLowerCase().toCharArray();
		System.out.println( "Enter the Input1 : " );
		String str1 = s.nextLine();
		char ch1 [] = str1.toLowerCase().toCharArray();
		int count = 0;
		Arrays.sort(ch);
		Arrays.sort(ch1);
		for( int  i = 0 ; i<str.length() ; i++ ) {
			if( ch[i] == ch1[i] ) {
				count++;
			}
		}
		if( count == str.length() ) {
			System.out.println( "The given two String is anagram." );
		}
		else {
			System.out.println( "The given two String is not anagram." );
		}
		s.close();
	}
}
