package guvi;
import java.util.*;
public class CheckSumOfGivenInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int array[] = new int[size];
		for(int i = 0 ; i < size ; i++ ) {
			array[i] = s.nextInt();
		}
		int target = s.nextInt();
		int temp1 = 0;
		int temp2 = 0;
		for( int i = 0 ; i < size ; i ++ ) {
			for( int j = 0 ; j < size ; j++ ) {
				if( array[i] + array[j] == target ) {
					 temp1 = array[i];
					 temp2 = array[j];
				}
			}
		}
		System.out.println( temp1 + "," + temp2);
		s.close();
	}
}
