package guvi;
import java.util.*;
public class ChechPrefixInStringArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the size of array : " );
		int size = s.nextInt();
		System.out.println( "Enter the array elements : " );
		String array[] = new String[size];
		for( int i = 0 ; i < size ; i++ ) {
			array[i] = s.next();
		}
		int count = 0;
		for( int i = 0 ; i < size ; i++ ) {
			if( ( array[i].length() > 2 ) && ( array[i].contains( "10" ) ) ) {
				count++;
			}
			if( array[i].length() == 2 && ( !( array[i].contains( "10" ) ) ) ) {
				count++;
			}
		}
		System.out.println( count );
		s.close();
	}
}
