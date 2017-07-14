package guvi;
import java.util.*;
public class Max2inoneiteration {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the size of array : " );
		int size = s.nextInt();
		System.out.println( "Enter the array elements : " );
		int arr [] = new int[size];
		for( int i = 0 ; i<size ; i++ ) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println( "2nd maximum in the given array : " + arr[arr.length-2] );
		s.close();
	}
}
