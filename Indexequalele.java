package guvi;
import java.util.*;
public class Indexequalele {
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the size of array : " );
		int num = s.nextInt();
		System.out.println( "Enter the array elements : " );
		int arr [] = new int[num];
		for( int i = 0 ; i<num ; i++ ){
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		for( int  i = 0 ; i<num ; i++ ){
			if( i==arr[i]){
				System.out.println( "The number " + i + " equals its index " + arr[i] );
			}
		}
		s.close();
	}
}
