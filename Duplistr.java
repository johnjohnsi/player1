package john;
import java.util.*;
public class Duplistr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the String : " );
		String str = s.nextLine();
		char ch[] =  str.toCharArray();
		int count = 0;
		Set<Character> dup = new TreeSet<Character>();
		for( int  i = 0 ; i<str.length() ; i++ ) {
		dup.add( ch[i] );
		}
		Iterator<Character> itr = dup.iterator();
		while( itr.hasNext() ) {
			itr.next() ;
			count++;
		}
		if( count== str.length() ) {
			System.out.println( "The given string is isogram" );
		}
		else {
			System.out.println( "The given string is not isogram" );
		}
		s.close();
	}
}
