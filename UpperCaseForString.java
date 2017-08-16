package guvi;
import java.util.*;
public class UpperCaseForString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String splitString[] = input.split( " " );
		for( int i = 0 ; i < splitString.length ; i++ ) {
			System.out.print(Character.toUpperCase((splitString[i].charAt(0))));
			for( int j = 1 ; j < splitString[i].length() ; j++ ) {
				System.out.print(splitString[i].charAt(j));
			}
			System.out.print( " " );
		}
		s.close();
	}
}
