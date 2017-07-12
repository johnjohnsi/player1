package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Leastkth {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the number : " );
		int num = s.nextInt();
		@SuppressWarnings("unused")
		int rem = 0;
		int count = 0;
		int temp = num;
		while( num!=0 ) {
			rem = num%10;
			count++;
			num /= 10;
		}
		int arr [] = new int[count];
		for( int i=0 ; i<count ; i++ ) {
			arr[i] = temp%10;
			temp /= 10;;
			}
		Arrays.sort(arr);
		System.out.println( "Enter the k value : " );
		int k = s.nextInt();
		for( int i = 0 ; i<k-1 ; i++ ) {
		System.out.println( arr[i] );
		}
		s.close();
	}
}
