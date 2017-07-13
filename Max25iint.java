package guvi;

import java.util.*;

public class Max25iint {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the array elements : " );
		int arr [] = new int[25];
		for( int  i = 0 ; i<25 ; i++ ) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println( "Maximum element in the array elements : " + arr[arr.length-1] );
		s.close();
	}

}
