package guvi;
import java.util.*;
import java.util.Map.Entry;
public class hhashmap {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Size of the array : " );
		int size = s.nextInt();
		System.out.println( "Enter the Strings : " );
		String str [] = new String[size];
		String str2 [] = new String[size];
		for( int i = 0 ; i<size ; i++ ) {
			str[i] = s.next();
		}
		for( int i = 0 ; i<size ; i++ ) {
			str2[i] = str[i].substring(0,3);
		}
		Map<String,String> join = new HashMap<String,String>();
		for( int i = 0 ; i<size ; i++ ) {
		join.put(str2[i].toUpperCase(), str[i]);
		}
		for( Entry<String,String> e : join.entrySet() ) {
			System.out.println( e.getKey() + " " + e.getValue() );
		}
	}
}
