package guvi;
import java.util.*;
public class MaximumDifference {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the size of array : " );
		int size = s.nextInt();
		System.out.println( "Enter the array elements : " );
		int array[] = new int[size];
		for( int i = 0 ; i < size ; i++ ) {
			array[i] = s.nextInt();
		}
		int max = -123;
		int index = 0;
		int difference[] = new int[size];
		for(int i = 0 ; i < size-1 ; i++ ) {
			difference[i] = array[i] - array[i+1];
			if( Math.abs(difference[i]) > max ) {
				max = Math.abs(difference[i]);
				index = i;
			}
		}
		System.out.println( "Output : " + index );
		s.close();
	}
}
