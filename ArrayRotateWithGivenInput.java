package guvi;
import java.util.*;
public class ArrayRotateWithGivenInput {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int position = s.nextInt();
		String array[] = new String[size];
		for( int i = 0 ; i < size ; i++ ) {
			array[i] = s.next();
		}
		for( int i = position ; i < size ; i++ ) {
			System.out.print( array[i] + " " );
		}
		for( int i = 0 ; i < position ; i++ ) {
			System.out.print( array[i] + " " );
		}
		s.close();
	}
}
