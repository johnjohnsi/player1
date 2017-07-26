package guvi;
import java.util.*;
public class FirstSubString {
	public static void main(String [] args ) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Size of the array : " );
		int size = s.nextInt();
		System.out.println( "Enter the array Elements : " );
		String arrayString [] = new String[size];
		for( int  i = 0 ; i < size ; i++ ) {
			arrayString[i] = s.next();
		}
		for( int  i = 0 ; i < size ; i++ ) {
			if( arrayString[i].length() == 1 ) {
				System.out.println( arrayString[i] );
				}
		}
		s.close();
	}
}
