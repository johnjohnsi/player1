package guvi;
import java.util.*;
public class Sortedornot {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the size os array : " );
		int size = s.nextInt();
		System.out.println( "Enter the array elements : " );
		int arr [] = new int[size];
		int temp [] = new int[size];
		for( int i = 0 ; i<size ; i++ ) {
			arr[i] = s.nextInt();
			temp[i] = arr[i];
		}
		int count = 0;
		Arrays.sort(arr);
		for( int i = 0 ; i<size ; i++ ) {
			if( arr[i] == temp[i] ) {
				count++;
			}
		}
		if( size == count ) {
			System.out.println( "The array is sorted." );
		}
		else {
			System.out.println( "The array is not sorted." );
		}
		s.close();
	}
}
