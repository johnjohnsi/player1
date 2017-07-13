package guvi;
import java.util.*;
public class Maladupcharrem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the String : " );
		String str = s.nextLine();
		char ch[] =  str.toCharArray();
		Set<Character> dup = new HashSet<Character>();
		for( int  i = 0 ; i<str.length() ; i++ ) {
		dup.add( ch[i] );
		}
		Iterator<Character> itr = dup.iterator();
		while( itr.hasNext() ) {
			System.out.print(itr.next()) ;
		}
		s.close();
	}

}
