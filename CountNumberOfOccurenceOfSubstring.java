package guvi;
import java.util.*;
public class CountNumberOfOccurenceOfSubstring {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		int count = 0;
		for( int i = 0 ; i < input.length() ; i++ ) {
			for( int j = 1 ; j <= input.length()-i ; j++ ) {
				count++;
			}
		}
		System.out.println( count );
		s.close();
	}
}
