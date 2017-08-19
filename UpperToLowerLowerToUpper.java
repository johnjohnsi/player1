package guvi;
import java.util.*;
public class UpperToLowerLowerToUpper {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		for( int  i = 0 ; i < input.length() ; i++ ) {
			if( Character.isUpperCase(input.charAt(i))) {
				System.out.print(Character.toLowerCase(input.charAt(i)));
			}
			if( Character.isLowerCase(input.charAt(i))) {
				System.out.print(Character.toUpperCase(input.charAt(i)));
			}
		}
		s.close();
	}
}
