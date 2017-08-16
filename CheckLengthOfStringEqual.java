package guvi;
import java.util.*;
public class CheckLengthOfStringEqual {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		String input[] = new String[size];
		for( int i = 0 ; i < size ; i++ ) {
			input[i] = s.next();
		}
		String targetString = s.next();
		int count = 0;
		for( int i = 0 ; i < size ; i++ ) {
			if(targetString.length() != input[i].length() ) {
				count++;
			}
		}
		System.out.println( count );
		s.close();
	}
}
