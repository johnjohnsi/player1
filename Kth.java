package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Kth {
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the array elements : " );
		int arr [] = new int[50];
		for( int i = 0 ; i<50 ; i++ ){
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println( " The 4th tallest Student " + arr[arr.length-4]);
		System.out.println( "Enter the k value" );
		int k = s.nextInt();
		System.out.println( "The kth tallest Student" + arr[arr.length-k] );
		s.close();
	}

}
