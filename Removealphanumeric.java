package guvi;
import java.util.*;
public class Removealphanumeric {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the String : " );
		String str = s.nextLine();
		char ch [] = str.toCharArray();
		for( int i = 0 ; i<str.length() ; i++ ) {
			if( !( ( ch[i] >= 'A' && ch[i] <= 'Z' ) || ( ch[i] >= 'a' && ch[i] <= 'z' ) ) ) {
				System.out.print( ch[i] );
		}
	}
	s.close();
	}
}
