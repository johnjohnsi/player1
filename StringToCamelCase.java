package guvi;
import java.util.*;
public class StringToCamelCase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String splitString[] = input.split( " " );
		for ( int i = 0 ; i < splitString.length ; i++ ) {
			char ch = Character.toUpperCase(splitString[i].charAt(0));
			System.out.print( ch + splitString[i].substring(1) );
			System.out.print( " " );
		}
		s.close();
	}
}
