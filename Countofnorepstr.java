package guvi;
import java.util.*;
public class Countofnorepstr {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the String : " );
		String str = s.nextLine();
		char ch [] = str.toCharArray();
		Set<Character> rep = new TreeSet<Character>();
		for( int i = 0 ; i<str.length() ; i++ ) {
			rep.add( ch[i] );
		}
		int count = 0;
		Iterator<Character> itr = rep.iterator();
		while( itr.hasNext() ) {
			itr.next();
			count++;
		}
		System.out.println( count );
		s.close();
	}
}
