package guvi;
import java.util.*;
public class AppearsOnlyOnce {
	public static void main( String [] args ) {
		Scanner s = new Scanner( System.in);
		System.out.println( "Enter the Size of array elements : " );
		int size = s.nextInt();
		System.out.println( "Enter the array Elements : " );
		int array[] = new int[size];
		for( int i = 0 ; i < size ; i++ ) {
			array[i] = s.nextInt();
		}
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for( int i = 0 ; i < size ; i++ ) {
			arrayList.add( array[i] );
		}
		for( Integer I : arrayList ) {
			if(Collections.frequency( arrayList , I ) == 1 ) {
				System.out.println( I );
			}
		}
		s.close();
	}
}
